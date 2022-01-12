package com.KomSoft.lection6;

public class UkrainePrice extends CarTransportationCosts {

    @Override
    public double countLocalCost() {
        double someLocalCosts = 14000.0;
        return this.countPrimeCost() + this.countTransportationCosts("Ukraine") + someLocalCosts;
    }

}
