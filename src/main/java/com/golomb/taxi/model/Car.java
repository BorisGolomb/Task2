package com.golomb.taxi.model;

public class Car {
    private String manufacturer;
    private int manufactureYear;
    private double littersPerHundredKm;
    private double startPrice;
    private double kilometerPrice;
    private int carPrice;

    public Car(int carPrice, double littersPerHundredKm) {
        this.carPrice = carPrice;
        this.littersPerHundredKm = littersPerHundredKm;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public double getLittersPerHundredKm() {
        return littersPerHundredKm;
    }

    public void setLittersPerHundredKm(double littersPerHundredKm) {
        this.littersPerHundredKm = littersPerHundredKm;
    }

    public double getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(double startPrice) {
        this.startPrice = startPrice;
    }

    public double getKilometerPrice() {
        return kilometerPrice;
    }

    public void setKilometerPrice(double kilometerPrice) {
        this.kilometerPrice = kilometerPrice;
    }

    public int getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", manufactureYear=" + manufactureYear +
                ", littersPerHundredKm=" + littersPerHundredKm +
                ", startPrice=" + startPrice +
                ", kilometerPrice=" + kilometerPrice +
                ", carPrice=" + carPrice +
                '}';
    }
}
