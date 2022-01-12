package com.KomSoft.lection5.game.battle;

import com.KomSoft.lection5.game.entities.Soldier;

public class Army {
    protected int num = 99;
    protected Soldier[] soldiers;
//    static int count = 0;
    private int count = 0;

    public Army(int num) {
        if (num > 0 ) {
            this.num = num;
        }
        soldiers = new Soldier[num];
    }

    public boolean addSoldier(Soldier soldier) {
        if (count >= num ) {
            return false;
        } else {
            this.soldiers[count++] = soldier;
            return true;
        }
    }

    public int calcArmyHealth() {
        int armyHealth = 0;
        for (int i = 0; i < count; i++) {
            armyHealth += soldiers[i].getHealth();
        }
        return armyHealth;
    }
}
