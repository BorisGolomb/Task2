package com.golomb.taxi;

import com.golomb.taxi.service.CarService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        CarService carService = new CarService();
        carService.execute();
    }
}
