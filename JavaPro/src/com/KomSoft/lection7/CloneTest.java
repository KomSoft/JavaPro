package com.KomSoft.lection7;

import javax.sound.midi.Soundbank;

public class CloneTest {

    static class Person implements Cloneable {
        private String name;
        private int age;
        private Car car;

        public Person(String name, int age, Car car) {
            this.name = name;
            this.age = age;
            this.car = car;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public String toString() {
            return this.name + " {" + "age = " +age + ", car = " + car + "}";
        }
    }

    static class Person2 {
        private String name;
        private int age;
        private Car car;

        public Person2(String name, int age, Car car) {
            this.name = name;
            this.age = age;
            this.car = car;
        }

        public Person2(Person2 other) {
            this.name = other.getName();
            this.age = other.getAge();
            Car car = new Car(other.getCar().color);
            this.car = car;
        }

/*
        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
*/

        @Override
        public String toString() {
            return "Person2 {" + this.name + ", " + "age = " +age + ", car = " + car + "}";
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public Car getCar() {
            return car;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    static class Car {
        public String color;

        public Car(String color) {
            this.color = color;
        }

        @Override
        public String toString(){
           return " {color car = '" + color + "'" + "}";
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car("Cream");
        Person person = new Person("Mike", 18, car);
        Person clone = (Person) person.clone();
        System.out.println(person);
        System.out.println("Clone: " + clone);
        clone.name = "John";
        clone.car.color = "red";
        System.out.println(person);
        System.out.println("Clone: " + clone);
        System.out.println();

        Car car2 = new Car("Olive");
        Person2 original2 = new Person2("Grishka", 18, car2);
        Person2 clone2 = new Person2(original2);
        System.out.println(original2);
        System.out.println("Clone: " + clone2);
        clone2.setName("New Name");
        clone2.getCar().color = "New Color";
        System.out.println(original2);
        System.out.println("Clone: " + clone2);

    }
}
