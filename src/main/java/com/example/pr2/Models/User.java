package com.example.pr2.Models;

public class User {
    private Long id_user;

    private String name;

    private String surname;
    private String patronymic;

    public User() {

    }

    public User(Long id_user, String name, String surname, String patronymic) {
        this.id_user = id_user;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
}
