package com.example.restservice;

import lombok.*;

import java.time.LocalDate;
import java.time.Period;

@NoArgsConstructor
@ToString
@Setter
public class User {

    private @Getter Long id;
    private @Getter String name;
    private Integer age;
    private @Getter LocalDate birthDate;
    private @Getter String email;


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
}
