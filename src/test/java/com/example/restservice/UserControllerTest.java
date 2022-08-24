package com.example.restservice;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserControllerTest {
    UserController userController = new UserController(new UserService());
    @Test
    void getUser() {
        User user = new User(1L, "Artur", LocalDate.of(2001, Month.APRIL, 20), "artur@kreegipuu.net");
        User user2 = new User(2L, "Arthur", LocalDate.of(2002, Month.APRIL, 20), "arthur@kreegipuu.net");
        List<User> users2 = new ArrayList<User>();
        users2.add(user);
        users2.add(user2);
        assertEquals(users2.toString(),userController.getUser().toString());
    }
}