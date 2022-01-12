package com.KomSoft.lection10;

public class ConnectorRunner {

    public static void main(String[] args) {
        SameResource f = new SameResource();
        try {
            Connector.loadResource(f);
        } catch (IllegalArgumentException e) {
            System.err.println("обработка unchecked-выключения вне метода: " + e);
        }
    }
}
