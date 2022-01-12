package com.KomSoft.lection6;

public class Person implements Comparable<Person> {
    private String firstName;
    private String surName;

    public Person(String sn, String fn) {
        this.firstName = fn;
        this.surName = sn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public String toString() {
        return getSurName() + " " + getFirstName();
    }

    @Override
    public int compareTo(Person o) {
        return getSurName().compareToIgnoreCase(o.getSurName());
    }
}
