package com.KomSoft.lection5.game.entities;

public class Sergeant extends Soldier {
    public Sergeant(String rank) {
        super(rank);
        super.health *= 10;
        System.out.println("Здоровье сержанта увеличено в 10 раз.");
    }
}
