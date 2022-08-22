package com.example.restservice;

import lombok.*;

import java.time.LocalDate;
import java.time.Period;

@NoArgsConstructor
@ToString
public class User {

    private @Getter @Setter
    Long id;
    private @Getter @Setter
    String name;
    private @Setter Integer age;
    private @Getter
    LocalDate birthDate;
    private @Getter @Setter
    String email;


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
