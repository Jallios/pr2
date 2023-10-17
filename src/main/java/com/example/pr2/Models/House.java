package com.example.pr2.Models;

public class House {
    private Long id_house;

    private String address;

    private int square;

    private int number_of_rooms;

    public House() {

    }

    public House(Long id_house, String address, int square, int number_of_rooms) {
        this.id_house = id_house;
        this.address = address;
        this.square = square;
        this.number_of_rooms = number_of_rooms;
    }

    public Long getId_house() {
        return id_house;
    }

    public void setId_house(Long id_house) {
        this.id_house = id_house;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public int getNumber_of_rooms() {
        return number_of_rooms;
    }

    public void setNumber_of_rooms(int number_of_rooms) {
        this.number_of_rooms = number_of_rooms;
    }
}
