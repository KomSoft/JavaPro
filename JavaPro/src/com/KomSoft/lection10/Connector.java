package com.KomSoft.lection10;

public class Connector {

    public static void loadResource(SameResource f) {
        if (f != null || !f.exists() || !f.isCreate()) {
            throw new IllegalArgumentException();   // генерация исключения
        }
    }
}
