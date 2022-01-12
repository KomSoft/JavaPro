package com.KomSoft.lection5.game.battle;

import com.KomSoft.lection5.game.entities.Soldier;

import java.util.Random;

public class TestBattle {
    Soldier s1 = new Soldier("Солдат");
    Soldier s2 = new Soldier("Солдат");

    public TestBattle() {
        battle(s1,s2);
    }

    public void battle(Soldier s1, Soldier s2) {
        Random gen = new Random();
        while (s1.isAlive() && s2.isAlive()) {
            s1.hit(s2, gen.nextInt(75));
            if(s2.isAlive()) { // если второй умер, то мертвые не воюют
                s2.hit(s1, gen.nextInt(75));
            }
        }
        if (s1.isAlive()) {
            // idWinner = soldiers[0].getId();
            System.out.println("**** Конец боя. Победил " + s1 + " ****");
        } else {
            System.out.println("**** Конец боя. Победил " + s2 + " ****");
        }
    }

    public static void main(String[] args) {
        // создать объект, выполнение продолжится из конструктора
        new TestBattle();
    }
}
