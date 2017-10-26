package com.golomb.taxi.dao.jdbc;

import com.golomb.taxi.dao.CarDao;
import com.golomb.taxi.model.Car;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcCarDao implements CarDao {
    @Override
    public void initStorage() {

    }

    @Override
    public Car getCarById(Integer id) {
        return null;
    }

    @Override
    public List<Car> getAllCars() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = null;
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/task2", "root", "");

        String selectSQL = "SELECT id, litters_per_hundred_km, car_price FROM task2.cars";
        PreparedStatement preparedStatement = conn.prepareStatement(selectSQL);
        ResultSet rs = preparedStatement.executeQuery(selectSQL);

        List<Car> result = new ArrayList<>();

        while (rs.next()) {
            Integer id = rs.getInt("id");
            double littersPerHundredKm = rs.getDouble("litters_per_hundred_km");
            int price = rs.getInt("car_price");
            result.add(new Car(id, price, littersPerHundredKm));
        }

        rs.close();
        preparedStatement.close();
        conn.close();

        return result;
    }

    @Override
    public void deleteCarById(Integer id) {

    }

    @Override
    public void saveCar(Car car) {

    }

    @Override
    public void saveCars(List<Car> cars) {

    }
}
