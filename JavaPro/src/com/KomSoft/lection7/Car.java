package com.KomSoft.lection7;

public class Car {
    private static int count;
    public int id;
    public String _maker;
    public double _price;
    public String _year;
    public String _color;


    public Car() {
        id = ++count;
    }

    public Car(String maker, String color, double price, String year) {
        _maker = maker;
        _price = price;
        _year = year;
        _color = color;
        id = ++count;
    }

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Auto " + id + " " + _maker + " " + _color + " " + _price + " " + _year + " ";
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1._maker = "Audi";
        car1._price = 10000;
        car1._year = "2000";
        car1._color = "red";
        Car car2 = new Car("BMW", "black", 12000, "2001");
        System.out.println(car1);
        System.out.println(car2);

    }
}
