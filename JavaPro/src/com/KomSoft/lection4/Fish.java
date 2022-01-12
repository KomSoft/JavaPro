package com.KomSoft.lection4;

public class Fish implements Swim {
    private String name;

    public Fish(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println("I am fish " + name + ". I плыву, двигая плавниками.");
    }
}
