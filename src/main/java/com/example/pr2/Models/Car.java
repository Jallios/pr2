package com.example.pr2.Models;

public class Car {
    private Long id_car;
    private String mark;
    private String model;
    private int mileage;

    public Car() {

    }

    public Car(Long id_car, String mark, String model, int mileage) {
        this.id_car = id_car;
        this.mark = mark;
        this.model = model;
        this.mileage = mileage;
    }

    public Long getId_car() {
        return id_car;
    }

    public void setId_car(Long id_car) {
        this.id_car = id_car;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
