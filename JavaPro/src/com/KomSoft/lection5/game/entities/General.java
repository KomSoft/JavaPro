package com.KomSoft.lection5.game.entities;

public class General extends Soldier {
    private String slogan = "Never give up!";

    public General(String rank) {
        super(rank);
        super.health *= 100;
        System.out.println("Здоровье генерала увеличено в 100 раз.");
    }

    public String getSlogan() {
        return slogan;
    }

    @Override
    public String toString() {
        return "Генерал со здоровьем " + super.health + ", его лозунг: " + slogan;
    }

}
