package com.example.restservice;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.Period;
@Entity
@NoArgsConstructor
@Data
@DynamicInsert
public class Users {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer age;
    private LocalDate birthDate;
    private String email;
    @Builder
    public Users(Long id, String name, LocalDate birthDate, String email) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
        this.age = this.getAge();
    }
    @Builder
    public Users(String name, LocalDate birthDate, String email) {
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
        this.age = this.getAge();
    }

    public Integer getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        this.setAge(this.getAge());
    }
}