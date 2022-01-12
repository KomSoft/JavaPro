package com.KomSoft.lection5.game.battle;

import com.KomSoft.lection5.game.entities.General;
import com.KomSoft.lection5.game.entities.Sergeant;
import com.KomSoft.lection5.game.entities.Soldier;

import java.util.Random;

public class TestBattle2 {
    Sergeant ser = new Sergeant("Сержант");
    General gen = new General("Генерал");
    Soldier[] s = new Soldier[100];
    Army army = new Army(99);

    public TestBattle2() {
        s[0] = new Soldier("Солдат");
        s[1] = new Soldier("Солдат");
        s[2] = new Soldier("Солдат");
        s[3] = new Soldier("Солдат");
        army.addSoldier((battle(ser, gen)));
        army.addSoldier((battle(s[0], s[1])));
        army.addSoldier((battle(s[2], s[3])));
        System.out.println("Суммарное здоровье армии: " + army.calcArmyHealth());
    }

    public Soldier battle(Soldier s1, Soldier s2) {
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
            return s1;
        } else {
            System.out.println("**** Конец боя. Победил " + s2 + " ****");
            return s2;
        }
    }

    public static void main(String[] args) {
        new TestBattle2();
    }

}
