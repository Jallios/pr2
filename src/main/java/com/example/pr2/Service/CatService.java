package com.example.pr2.Service;

import com.example.pr2.CRUD;
import com.example.pr2.Models.Cat;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CatService implements CRUD<Cat> {

    private static long CAT_COUNT;
    private final List<Cat> catList;
    {
        catList = new ArrayList<>();

        catList.add(new Cat(++CAT_COUNT, "Яша","Веслоухий",8));
    }
    @Override
    public List<Cat> index() {
        return catList;
    }

    @Override
    public Cat show(Long id) {
        return catList.stream().filter(cat -> cat.getId_cat() == id).findAny().orElse(null);
    }

    @Override
    public void save(Cat cat) {
        cat.setId_cat(++CAT_COUNT);
        catList.add(cat);
    }

    @Override
    public void update(Long id, Cat cat) {
        Cat catToUpdate = show(id);

        catToUpdate.setAge(cat.getAge());
        catToUpdate.setBreed(cat.getBreed());
        catToUpdate.setNickname(cat.getNickname());
    }

    @Override
    public void delete(Long id) {
        catList.removeIf(p -> p.getId_cat() == id);
    }
}
