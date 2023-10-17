package com.example.pr2.Service;

import com.example.pr2.CRUD;
import com.example.pr2.Models.Cat;
import com.example.pr2.Models.House;
import com.example.pr2.Models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements CRUD<User> {

    private static long USER_COUNT;
    private final List<User> userList;
    {
        userList = new ArrayList<>();

        userList.add(new User(++USER_COUNT, "Максим","Полещук","Сергеевич"));
    }
    @Override
    public List<User> index() {
        return userList;
    }

    @Override
    public User show(Long id) {
        return userList.stream().filter(cat -> cat.getId_user() == id).findAny().orElse(null);
    }

    @Override
    public void save(User user) {
        user.setId_user(++USER_COUNT);
        userList.add(user);
    }

    @Override
    public void update(Long id, User user) {
        User userToUpdate = show(id);

        userToUpdate.setName(user.getName());
        userToUpdate.setSurname(user.getSurname());
        userToUpdate.setPatronymic(user.getPatronymic());
    }

    @Override
    public void delete(Long id) {
        userList.removeIf(p -> p.getId_user() == id);
    }
}
