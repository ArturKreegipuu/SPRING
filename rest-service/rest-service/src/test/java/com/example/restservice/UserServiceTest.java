package com.example.restservice;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {
    UserService userService = new UserService();
    @Test
    void getUserListTest() {
        List<User> users = userService.getUser();
        User user = new User(1L, "Artur", LocalDate.of(2001, Month.APRIL, 20), "artur@kreegipuu.net");
        assertEquals(List.of(user).toString(), users.toString());
    }


}