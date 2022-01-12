package com.KomSoft.lection7;

public class Person {
        private String name;
        private int age;

    public Car getCar() {
        return car;
    }

    private Car car;

        public Person(String name, int age, Car car) {
            this.name = name;
            this.age = age;
            this.car = car;
        }

        public Person(Person other) {
//        this(other.getName(), other.getAge(), new Car(other.getCar().color));
    }

    @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public String toString() {
            return this.name + " {" + "age = " +age + ", car = " + car + "}";
        }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
//        Person original = new Person("original", 18);

    }
}
