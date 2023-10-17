package com.example.pr2.Models;

public class Cat {
    private Long id_cat;
    private String nickname;
    private String breed;
    private int age;

    public Cat() {

    }

    public Cat(Long id_cat, String nickname, String breed, int age) {
        this.id_cat = id_cat;
        this.nickname = nickname;
        this.breed = breed;
        this.age = age;
    }

    public Long getId_cat() {
        return id_cat;
    }

    public void setId_cat(Long id_cat) {
        this.id_cat = id_cat;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
