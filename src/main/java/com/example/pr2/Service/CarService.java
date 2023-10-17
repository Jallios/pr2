package com.example.pr2.Service;

import com.example.pr2.CRUD;
import com.example.pr2.Models.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService  implements CRUD<Car> {

    private static long CAR_COUNT;
    private final List<Car> carList;
    {
        carList = new ArrayList<>();

        carList.add(new Car(++CAR_COUNT, "BMW","M2 Competion",19000));
    }
    @Override
    public List<Car> index() {
        return carList;
    }

    @Override
    public Car show(Long id) {
        return carList.stream().filter(car -> car.getId_car() == id).findAny().orElse(null);
    }

    @Override
    public void save(Car car) {
        car.setId_car(++CAR_COUNT);
        carList.add(car);
    }

    @Override
    public void update(Long id, Car car) {
        Car carToUpdate = show(id);

        carToUpdate.setModel(car.getModel());
        carToUpdate.setMileage(car.getMileage());
        carToUpdate.setMark(car.getMark());
    }

    @Override
    public void delete(Long id) {
        carList.removeIf(p -> p.getId_car() == id);
    }
}
