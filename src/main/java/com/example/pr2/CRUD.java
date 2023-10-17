package com.example.pr2;

import com.example.pr2.Models.Car;

import java.util.ArrayList;
import java.util.List;

public interface CRUD<T> {

    List<T> index();

    T show(Long id);

    void save(T t);

    void update(Long id, T t);

    void delete(Long id);

}
