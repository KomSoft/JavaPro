package com.KomSoft.lection6;

public class Box {
    private int width;
    private int height;
    private int depth;

/*
    void setParams(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }
*/
    Box(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = 10;
        height = 10;
        depth = 10;
    }

    Box(int width) {    // для кубической коробки
        this(width, width, width); // вызов конструктора для нестандартной коробки - this
    }

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    int getVolume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        Box defaultBox = new Box();
        System.out.println("Standard Box Volume = " + defaultBox.getVolume());
        Box catBox = new Box(100, 200, 100);
        System.out.println("Big Box Volume = " + catBox.getVolume());
        Box cubeBox = new Box(100);
        System.out.println("Cube Box Volume = " + cubeBox.getVolume());

    }
}
