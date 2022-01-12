package com.KomSoft.lection6;

import java.util.Arrays;

public class UsingPerson {

    public UsingPerson() {
        Person[] person = new Person[3];
        person[2] = new Person("Перебійніс", "Василь");
        person[0] = new Person("Козаченко", "Петро");
        person[1] = new Person("Назаренко", "Іван");

        Arrays.sort(person);

        for(Person p : person) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        new UsingPerson();
    }
}
