package com.KomSoft.lection5.game.entities;

import java.util.Random;

public class Soldier {
    protected int health;
    protected boolean alive = false;
    protected int defence = 0;
    protected static int count = 0;
    private int id = 0; // identifier
    protected String rank;

    public int getHealth() {
        return health;
    }

    public Soldier(String rank) {
        this.rank = rank;
        health = 100;
        id = ++count;
        alive = true;
        Random randomGen = new Random();
        defence = randomGen.nextInt(50);
        System.out.println(rank + " #" + id + " is created: health = " + health);
    }

    private void receiveHit(int hit) {
        if ( isAlive() ) {
            int damage = hit - defence;     // вычисляем повреждения
            if ( damage > 0 ) {
                health -= damage;
                System.out.print("[X] " + rank + " #" + id + " - защита пробита. Получил повреждения " + damage);
           } else {
                System.out.println("[X] " + rank + " #" + id + " - защита не пробита.");
                return;
            }
            if (health <= 0 ) {
                alive = false;
                System.out.println(" и героически погиб.");
            } else {
                System.out.println(". Осталось здоровья " + health);
            }
        }
    }

    public boolean isAlive() {
        return alive;
    }

    public void hit(Soldier targetSoldier, int hit) {
        targetSoldier.receiveHit(hit);
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return  rank + " #" + id + ": здоровье= " + health + ", защита=" + defence;
    }
}
