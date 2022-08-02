package com.example.restservice;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserControllerTest {
    UserController userController = new UserController(new UserService());
    @Test
    void getUser() {
        assertEquals(List.of(new User(1L, "Artur", LocalDate.of(2001, Month.APRIL, 20), "artur@kreegipuu.net")).toString(),userController.getUser().toString());
    }
}