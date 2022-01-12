package com.KomSoft.lection9;

public class MelomanRunner {

    public static void main(String[] args) {
        MusicStyle ms = MusicStyle.CLASSIC; // initialization
        System.out.print(ms);
        switch (ms) {
            case JAZZ: {
                System.out.println(" in Jazz");
                break;
            }
            case CLASSIC: {
                System.out.println(" in Classic");
                break;
            }
            case ROCK: {
                System.out.println(" in Rock");
                break;
            }
            case BLUES: {
                System.out.println(" in Blues");
                break;
            }
            default:
                System.out.println("Unknown music style");
        }
    }
}