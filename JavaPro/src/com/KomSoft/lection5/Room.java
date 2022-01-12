package com.KomSoft.lection5;

public class Room {
    private  double width = 0.0;
    private  double height =  0.0;
    private  double length = 0.0;

    public Room(double w, double l, double h) {
        this.width = w;
        this.height = h;
        this.length = l;
    }

    public double calculateCapacity() {
        return width * height * length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
