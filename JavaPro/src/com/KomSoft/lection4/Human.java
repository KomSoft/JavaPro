package com.KomSoft.lection4;

public class Human implements Swim {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void swim() {
        System.out.println("Я " + name + ". Мне " + age + " лет. Я плыву на надувном кругу.");
    }
}
