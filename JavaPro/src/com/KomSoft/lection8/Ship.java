package com.KomSoft.lection8;

public class Ship {
    private int id;
    private Engine engine;

    // abstract, final, private, protected
    public class Engine {

        public void launch() {
            System.out.println("Запуск двигателя");
        }
    }

    public final void  init() {
        engine = new Engine();
        engine.launch();
    }

    public static class LifeBoat{
        private int boatId;

        public static void down() {
            System.out.println("Шлюпки на воду!");
        }

        public void swim() {
            System.out.println("Шлюпка отплывает!");
        }
    }
}
