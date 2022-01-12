package com.KomSoft.lection5;

public class Room2 extends Room {

    public Room2(double w, double h, double l) {
        super(w,h,l);
    }

    @Override
    public double calculateCapacity() {
        return super.calculateCapacity() * 1000;
    }

    public double calculateSquare() {
        return super.getWidth() * super.getLength();
    }

    @Override
    public String toString(){
        return "Room Capacity = " + calculateCapacity() + "\nRoom Square = " + calculateSquare();
    }

}
