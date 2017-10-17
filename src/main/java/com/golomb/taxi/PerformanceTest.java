package com.golomb.taxi;

import com.golomb.taxi.model.Car;

import java.util.ArrayList;
import java.util.List;

public class PerformanceTest {
    private static final int ITERATIONS_COUNT = 40000000;

    public static void main(String[] args) {
        //List<Car> cars = new LinkedList<>();
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < ITERATIONS_COUNT; i++) {
            cars.add(new Car(i, i));
            if (i % 1000000 == 0) {
                System.out.println(i / 1000000);
            }
        }

        long start = System.currentTimeMillis();

        //cars.add(new Car(ITERATIONS_COUNT + 1, ITERATIONS_COUNT + 1));
        cars.remove(20000000);

        long finish = System.currentTimeMillis();

        System.out.println("Remove: " + (finish - start) + " ms");
    }
}
