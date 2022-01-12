package com.KomSoft.lection4;

public class CoinVolume {

    public static void main(String[] args) {
        Safe mySafe1 = new Safe();
        Safe mySafe2 = new Safe();
/*
        mySafe1.width = 10;
        mySafe1.height = 15;
        mySafe1.depth = 20;
        mySafe1.safeVolume =mySafe1.width * mySafe1.height * mySafe1.depth;
*/
        mySafe1.setSafeValue(10, 15, 20);

/*
        mySafe2.width = 15;
        mySafe2.height = 20;
        mySafe2.depth = 15;
        mySafe2.safeVolume =mySafe2.width * mySafe2.height * mySafe2.depth;
*/
        mySafe2.setSafeValue(15, 20, 15);

/*
        System.out.println("Объем 1 сейфа = " + mySafe1.safeVolume);
        System.out.println("Объем 2 сейфа = " + mySafe2.safeVolume);
*/
        System.out.println("Объем 1 сейфа = " + mySafe1.getSafeVolume());
        System.out.println("Объем 2 сейфа = " + mySafe2.getSafeVolume());

        Point point = new Point();

    }
}
