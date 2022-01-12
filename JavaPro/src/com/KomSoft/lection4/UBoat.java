package com.KomSoft.lection4;

public class UBoat implements Swim {
    private int speed;

    public UBoat(int speed) {
        this.speed = speed;
    }

    @Override
    public void swim() {
        System.out.println("Подадная лодка плывет со скоростью " + speed + ", вращая винтом.");
    }
}
