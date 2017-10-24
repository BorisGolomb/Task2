package com.golomb.taxi.model;

public class ElectroCar extends Car {
    private int kilometersPerCharge;

    public ElectroCar(Integer id, int carPrice, double littersPerHundredKm) {
        super(id, carPrice, littersPerHundredKm);
    }

    public int getKilometersPerCharge() {
        return kilometersPerCharge;
    }

    public void setKilometersPerCharge(int kilometersPerCharge) {
        this.kilometersPerCharge = kilometersPerCharge;
    }
}
