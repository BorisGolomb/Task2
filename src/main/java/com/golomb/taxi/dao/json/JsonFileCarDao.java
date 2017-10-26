package com.golomb.taxi.dao.json;

import com.golomb.taxi.dao.CarDao;
import com.golomb.taxi.model.Car;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class JsonFileCarDao implements CarDao {

    private static final String FILE_NAME = "simple.json";

    @Override
    public void initStorage() {

    }

    @Override
    public Car getCarById(Integer id) {
        return null;
    }

    /* Write result to file.
    *
    * @param fileName
    *            file name.
    * @param data
    *            data.
    */
    private static void writeDataToFile(final String fileName, final String data) {

        try {
            Files.write(Paths.get(fileName), Arrays.asList(data), StandardCharsets.UTF_8);
        } catch (final IOException e) {

            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteCarById(Integer id) {

    }

    private static void readDataFromFile(final String fileName) {

        try {
            List<String> stringList = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);

        } catch (final IOException e) {

            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Car> getAllCars() {


        Gson gson = new Gson();
        String strJson;
        gson.fromJson(strJson, new TypeToken<List<Car>>());

    }

    @Override
    public void saveCar(Car car) {
        Gson gson = new Gson();
        String gsonStr = gson.toJson(car);

        writeDataToFile(FILE_NAME, gsonStr);
    }

    @Override
    public void saveCars(List<Car> cars) {
        Gson gson = new Gson();
        String gsonStr = gson.toJson(cars);

        writeDataToFile(FILE_NAME, gsonStr);

    }
}
