package com.KomSoft.lection7;

import java.io.*;

public class BasketCat {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cat.Color color = new Cat.Color("Gray");
        Cat vaska = new Cat ("Vaska", color, 4);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);

        oos.writeObject(vaska);
        oos.close();

        byte[] bytes = baos.toByteArray();

        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);

        Cat cloneVaska = (Cat) ois.readObject();
        System.out.println(vaska);
        System.out.println(cloneVaska);
        System.out.println("*****");

        cloneVaska.setColor(new Cat.Color("1"));
        cloneVaska.setName("BlackVaska");
        cloneVaska.getColor().setColor("Black");
//        cloneVaska.setColor("Black");
        System.out.println(vaska);
        System.out.println(cloneVaska);
    }
}
