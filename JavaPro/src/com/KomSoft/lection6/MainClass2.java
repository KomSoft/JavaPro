package com.KomSoft.lection6;

import java.util.Scanner;

public class MainClass2 {
    Scanner in;
    CarCost cc;
    public MainClass2() {
        in = new Scanner(System.in);
        System.out.print("Введите название страны: ");
        String str = in.nextLine();
        if (str.equalsIgnoreCase("Ukraine") || str.equalsIgnoreCase("Україна") || str.equalsIgnoreCase("Украина")) {
            cc = new UkrainePrice();
        } else if (str.equalsIgnoreCase("England") || str.equalsIgnoreCase("Англия") || str.equalsIgnoreCase("Англія")) {
            cc = new EnglandPrice();
        } else {
            System.out.println("Информация о такой стране отсутствует.");
            return;
        }
        System.out.println("Цена автомобиля (" + str + "): " + cc.countLocalCost());

    }

    public static void main(String[] args) {
        MainClass2 class1 = new MainClass2();
    }
}
