package com.KomSoft.lection6;

public abstract class CarCost {

    public double countPrimeCost() {
        // исчисление себестоимости
        return 50000.0;
    }
    /**
     *
     * @param country
     * @return
     */
    public abstract double countTransportationCosts(String country);

    /**
     *
     * @return
     */
    public abstract double countLocalCost();

}
