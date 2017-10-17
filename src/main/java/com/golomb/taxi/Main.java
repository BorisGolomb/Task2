package com.golomb.taxi;

import com.golomb.taxi.model.Car;
import com.golomb.taxi.model.ElectroCar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<Car>();

        cars.add(new Car(500, 10));
        cars.add(new ElectroCar(1200, 2.5));
        cars.add(new Car(200, 7.5));

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
