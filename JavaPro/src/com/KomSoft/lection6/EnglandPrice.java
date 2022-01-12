package com.KomSoft.lection6;

public class EnglandPrice extends CarTransportationCosts {

    @Override
    public double countLocalCost() {
        double enLocalCosts = 15800.0;
        double price = super.countPrimeCost() + super.countTransportationCosts("England") + enLocalCosts;
        return price;
    }
}
