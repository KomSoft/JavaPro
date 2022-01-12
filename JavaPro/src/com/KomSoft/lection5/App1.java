package com.KomSoft.lection5;

public class App1 {
    private Room2 room2;

    public App1() {
        this.room2 = new Room2(5.1, 5.2, 5.2);
//        System.out.println("App1 capacity: " + room2.calculateCapacity() + " м.куб");
        System.out.println(room2);  // эквивалентно System.out.println(room2.toString());
    }

    public static void main(String[] args) {
        new App1();
    }
}
