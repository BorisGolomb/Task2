package com.golomb.taxi;

import com.golomb.taxi.service.CarService;

public class Main {
    public static void main(String[] args) {
        CarService carService = new CarService();
        carService.execute();
    }
}
