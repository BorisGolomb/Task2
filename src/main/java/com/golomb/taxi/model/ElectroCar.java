package com.golomb.taxi.model;

public class ElectroCar extends Car {
    private int kilometersPerCharge;

    public ElectroCar(int carPrice, double littersPerHundredKm) {
        super(carPrice, littersPerHundredKm);
    }

    public int getKilometersPerCharge() {
        return kilometersPerCharge;
    }

    public void setKilometersPerCharge(int kilometersPerCharge) {
        this.kilometersPerCharge = kilometersPerCharge;
    }
}
