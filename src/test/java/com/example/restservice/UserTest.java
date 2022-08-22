package com.example.restservice;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user = new User();
    User user2 = User.builder().id(1L).name("Name").birthDate(LocalDate.of(2001, 04, 20)).email("name@name.name").build();
    User user3 = User.builder().name("Name").birthDate(LocalDate.of(2001, 04, 20)).email("name@name.name").build();
    @Test
    void getAge() {
        User user4 = User.builder().birthDate(LocalDate.of(2001, 04, 20)).build();
        assertEquals(21, user2.getAge());
        assertEquals(21, user3.getAge());
        assertEquals(21, user4.getAge());
    }
    @Test
    void getId() {
        assertEquals(1L, user2.getId());
    }

    @Test
    void getName() {
        assertEquals("Name", user2.getName());
        assertEquals("Name", user3.getName());
    }

    @Test
    void getBirthDate() {
        assertEquals(LocalDate.of(2001, 04, 20), user2.getBirthDate());
        assertEquals(LocalDate.of(2001, 04, 20), user3.getBirthDate());
    }

    @Test
    void getEmail() {
        assertEquals("name@name.name", user2.getEmail());
        assertEquals("name@name.name", user3.getEmail());
    }
    @Test
    void setId() {
        user2.setId(2L);
        assertEquals(2L, user2.getId());
    }

    @Test
    void setName() {
        user2.setName("newName");
        user3.setName("newName");
        assertEquals("newName", user2.getName());
        assertEquals("newName", user3.getName());
    }

    @Test
    void setBirthDate() {
        user2.setBirthDate(LocalDate.of(2002, 05, 21));
        user3.setBirthDate(LocalDate.of(2002, 05, 21));
        assertEquals(LocalDate.of(2002, 05, 21), user2.getBirthDate());
        assertEquals(LocalDate.of(2002, 05, 21), user3.getBirthDate());
    }

    @Test
    void setEmail() {
        user2.setEmail("name2@name2.name2");
        user3.setEmail("name2@name2.name2");
        assertEquals("name2@name2.name2", user2.getEmail());
        assertEquals("name2@name2.name2", user3.getEmail());
    }
}