package com.example.restservice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {
    HelloController helloController = new HelloController();
    @Test
    void hello() {
        Hello hello = new Hello("Tere, Artur!");
        assertEquals(hello.toString(), helloController.hello("Artur").toString());
    }
}