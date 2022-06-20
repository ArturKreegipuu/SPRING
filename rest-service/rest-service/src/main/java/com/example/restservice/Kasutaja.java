package com.example.restservice;

import java.time.LocalDate;

public class Kasutaja {
    private Long id;
    private String name;
    private Integer age;
    private LocalDate sünniaeg;
    private String email;

    public Kasutaja() {
    }

    public Kasutaja(Long id, String name, Integer age, LocalDate sünniaeg, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sünniaeg = sünniaeg;
        this.email = email;
    }

    public Kasutaja(String name, Integer age, LocalDate sünniaeg, String email) {
        this.name = name;
        this.age = age;
        this.sünniaeg = sünniaeg;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getSünniaeg() {
        return sünniaeg;
    }

    public void setSünniaeg(LocalDate sünniaeg) {
        this.sünniaeg = sünniaeg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Kasutaja{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sünniaeg=" + sünniaeg +
                ", email='" + email + '\'' +
                '}';
    }
}
