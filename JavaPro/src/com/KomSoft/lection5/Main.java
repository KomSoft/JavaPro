package com.KomSoft.lection5;

import com.KomSoft.lection5.game.entities.General;
import com.KomSoft.lection5.game.entities.Soldier;

public class Main {

    public static void main(String[] args) {

    Soldier sg = new General("Генерал");
    sg.getHealth();
//    sg.getSlogan(); // не работает

    General general = (General) sg;
    general.getSlogan();

        System.out.println(sg.getClass());
    }

}
