package com.example.restservice;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    Users users = new Users();
    Users users2 = Users.builder().id(1L).name("Name").birthDate(LocalDate.of(2001, 04, 20)).email("name@name.name").build();
    Users users3 = Users.builder().name("Name").birthDate(LocalDate.of(2001, 04, 20)).email("name@name.name").build();
    @Test
    void getAge() {
        Users users4 = Users.builder().birthDate(LocalDate.of(2001, 04, 20)).build();
        assertEquals(21, users2.getAge());
        assertEquals(21, users3.getAge());
        assertEquals(21, users4.getAge());
    }
    @Test
    void getId() {
        assertEquals(1L, users2.getId());
    }

    @Test
    void getName() {
        assertEquals("Name", users2.getName());
        assertEquals("Name", users3.getName());
    }

    @Test
    void getBirthDate() {
        assertEquals(LocalDate.of(2001, 04, 20), users2.getBirthDate());
        assertEquals(LocalDate.of(2001, 04, 20), users3.getBirthDate());
    }

    @Test
    void getEmail() {
        assertEquals("name@name.name", users2.getEmail());
        assertEquals("name@name.name", users3.getEmail());
    }
    @Test
    void setId() {
        users2.setId(2L);
        assertEquals(2L, users2.getId());
    }

    @Test
    void setName() {
        users2.setName("newName");
        users3.setName("newName");
        assertEquals("newName", users2.getName());
        assertEquals("newName", users3.getName());
    }

    @Test
    void setBirthDate() {
        users2.setBirthDate(LocalDate.of(2002, 05, 21));
        users3.setBirthDate(LocalDate.of(2002, 05, 21));
        assertEquals(LocalDate.of(2002, 05, 21), users2.getBirthDate());
        assertEquals(LocalDate.of(2002, 05, 21), users3.getBirthDate());
    }

    @Test
    void setEmail() {
        users2.setEmail("name2@name2.name2");
        users3.setEmail("name2@name2.name2");
        assertEquals("name2@name2.name2", users2.getEmail());
        assertEquals("name2@name2.name2", users3.getEmail());
    }
}