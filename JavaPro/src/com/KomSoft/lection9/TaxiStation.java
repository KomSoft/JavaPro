package com.KomSoft.lection9;

public enum TaxiStation {
    MERCEDES(10), TOYOTA(7), VOLVO;

    private int freeCabs;
    TaxiStation() {     // конструктор для VOLVO (когда нет инит значения / параметра ) !!
    }

    TaxiStation(int cabs) { // конструктор для случая, когда есть инит параметр ) !!
        freeCabs = cabs;
    }

    public int getFreeCabs() {
        return freeCabs;
    }

    public void setFreeCabs(int cabs) {
        freeCabs = cabs;
    }

    @Override
    public String toString() {
        return String.format("%s : free cabs = %d", name(), freeCabs);
    }
}
