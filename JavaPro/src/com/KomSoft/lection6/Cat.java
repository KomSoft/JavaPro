package com.KomSoft.lection6;

public class Cat {
    int age;
    int birthday;

    Cat(int i, int j) {
        age = i;
        birthday = j;
    }

    Cat(int i) {
//        age = birthday = i;
        this(i,i);
    }

    Cat() {
//        age = birthday = 0;
        this(0, 0);
    }



}
