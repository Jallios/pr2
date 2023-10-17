package com.example.pr2.Models;

public class Work {

    private Long id_work;

    private String address;

    private String company_name;
    private float salary;

    public Work() {

    }

    public Work(Long id_work, String address, String company_name, float salary) {
        this.id_work = id_work;
        this.address = address;
        this.company_name = company_name;
        this.salary = salary;
    }

    public Long getId_work() {
        return id_work;
    }

    public void setId_work(Long id_work) {
        this.id_work = id_work;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
