package com.example.restservice;

import lombok.*;

import java.time.LocalDate;
import java.time.Period;

@NoArgsConstructor
@Data
public class User {

    private Long id;
    private String name;
    private Integer age;
    private LocalDate birthDate;
    private String email;

    public User(Long id, String name, LocalDate birthDate, String email) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
    }

    public User(String name, LocalDate birthDate, String email) {
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
    }

    public Integer getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        this.setAge(this.getAge());
    }
}
