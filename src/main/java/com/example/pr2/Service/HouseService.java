package com.example.pr2.Service;

import com.example.pr2.CRUD;
import com.example.pr2.Models.House;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HouseService implements CRUD<House> {

    private static long HOUSE_COUNT;
    private final List<House> houseList;
    {
        houseList = new ArrayList<>();

        houseList.add(new House(++HOUSE_COUNT, "ул.Тестовая д.404",30,4));
    }
    @Override
    public List<House> index() {
        return houseList;
    }

    @Override
    public House show(Long id) {
        return houseList.stream().filter(house -> house.getId_house() == id).findAny().orElse(null);
    }

    @Override
    public void save(House house) {
        house.setId_house(++HOUSE_COUNT);
        houseList.add(house);
    }

    @Override
    public void update(Long id, House house) {
        House houseToUpdate = show(id);

        houseToUpdate.setAddress(house.getAddress());
        houseToUpdate.setSquare(house.getSquare());
        houseToUpdate.setNumber_of_rooms(house.getNumber_of_rooms());
    }

    @Override
    public void delete(Long id) {
        houseList.removeIf(p -> p.getId_house() == id);
    }
}
