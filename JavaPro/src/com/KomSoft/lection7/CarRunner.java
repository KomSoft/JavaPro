package com.KomSoft.lection7;

public class CarRunner {

    public static void main(String[] args) {
/*
        Car car1 = new Car();
        car1._maker = "Audi";
        car1._price = 10000;
        car1._year = "2000";
        car1._color = "red";

        Car car2 = new Car("BMW", "black", 12000, "2001");

        System.out.println(car1);
        System.out.println(car2);
*/

        Car car[] = new Car[5];
        car[0] = new Car("Audi", "red", 10000, "2000");
        car[1] = new Car("BMW", "black", 12000, "2001");
        car[2] = new Car("VAZ", "black", 12000, "2001");
        car[3] = new Car("Ford", "black", 12000, "2001");
        car[4] = new Car("Deo", "black", 12000, "2001");
//        System.out.println("Car count - " + car[4].getCount() + "  car[].length = " + car.length);
        for (int i = 0; i < Car.getCount(); i++) {
            System.out.println(car[i]);
        }
    }
}
