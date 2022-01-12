package com.KomSoft.lection6;

public class MainClass {
    UkrainePrice uaPrice = null;
    EnglandPrice enPrice = null;

    MainClass() {
        uaPrice = new UkrainePrice();
        enPrice = new EnglandPrice();

        System.out.println("Цена автомобиля в Украине: " + uaPrice.countLocalCost());
        System.out.println("Цена автомобиля в Англии: " + enPrice.countLocalCost());
    }

    public static void main(String[] args) {
        new MainClass();
    }
}
