package com.golomb.taxi.service;

import com.golomb.taxi.dao.CarDao;
import com.golomb.taxi.dao.jdbc.JdbcCarDao;
import com.golomb.taxi.model.Car;

import java.sql.SQLException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarService {
    private CarDao dao = new JdbcCarDao();
//    private CarDao dao = new JsonFileCarDao();

    public void execute() throws SQLException, ClassNotFoundException {
        dao.initStorage();

//        List<Car> cars = new ArrayList<Car>();

//        cars.add(new Car(500, 10));
//        cars.add(new ElectroCar(1200, 2.5));
//        cars.add(new Car(200, 7.5));

        List<Car> cars = dao.getAllCars();

        System.out.println(cars);

        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                double littersPerHundredKm1 = o1.getLittersPerHundredKm();
                double littersPerHundredKm2 = o2.getLittersPerHundredKm();

                if (littersPerHundredKm1 > littersPerHundredKm2) {
                    return 1;
                } else if (littersPerHundredKm1 == littersPerHundredKm2) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });

        System.out.println(cars);

        int totalParkPrice = cars.stream().mapToInt(Car::getCarPrice).sum();
        System.out.println(totalParkPrice);
    }
}
