package com.KomSoft.lection6;

@FunctionalInterface
public interface SimpleFunInterface {

    // этот метод abstract - в функциональном интерфейсе должен быть только ОДИН абстракный метод!
    public void doWork();

//    public void doWork2();

    default void doWork3() {

    }

}
