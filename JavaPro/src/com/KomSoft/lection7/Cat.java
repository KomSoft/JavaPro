package com.KomSoft.lection7;

import java.awt.*;
import java.io.Serializable;

public class Cat implements Serializable {

    private String name;
    private Color color;
    private int age;

    public Cat(String name, Color color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" + "name='" + name + '\'' + ", color='" + color + '\'' + ", age=" + age + '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    static class Color implements Serializable {
        private String color;

        public Color(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Color{" + "color='" + color + '\'' + '}';
        }
    }

    public static void main(String[] args) {
        Cat cat = new Cat("1", new Color("Gray"), 33);

        System.out.println(cat);
    }
}
