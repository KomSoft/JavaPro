package com.KomSoft.lection4;

public class ClassFieldInitOrder {

    static int initialize(String message) {
        System.out.println(message);
        return 0;
    }

    static class A {
        int i0 = initialize("i0");

        int i1;
        {
            i1 = initialize("i1");
        }
        int i2 = initialize("i2");
        int i3;
        public A() {
            i3 = initialize("i3");
        }
    }

    static class B extends A {

    }

    public static void main(String[] args) {
        System.out.println("in main");
        new B();
    }
}
