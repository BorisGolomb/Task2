package com.golomb.taxi.dao.json;

import com.golomb.taxi.dao.CarDao;
import com.golomb.taxi.model.Car;

import java.util.List;

public class JsonFileCarDao implements CarDao {
    @Override
    public void initStorage() {

    }

    @Override
    public Car getCarById(Integer id) {
        return null;
    }

    @Override
    public List<Car> getAllCars() {
        return null;
    }

    @Override
    public void deleteCarById(Integer id) {

    }

    @Override
    public void saveCar(Car car) {

    }
}
