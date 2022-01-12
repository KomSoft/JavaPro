package com.KomSoft.lection4;

public class Safe {
    double width = 0;
    double height = 0;
    double depth = 0;
//    double safeVolume = 0;

    void setSafeValue(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double getSafeVolume() {
        return width * height * depth;
    }

}
