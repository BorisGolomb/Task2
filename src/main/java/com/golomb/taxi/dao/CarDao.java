package com.golomb.taxi.dao;

import com.golomb.taxi.model.Car;

import java.sql.SQLException;
import java.util.List;

public interface CarDao {
    void initStorage();

    Car getCarById(Integer id);

    List<Car> getAllCars() throws ClassNotFoundException, SQLException;

    void deleteCarById(Integer id);

    void saveCar(Car car);
}
