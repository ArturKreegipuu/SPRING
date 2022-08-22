package com.example.restservice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingControllerTest {
    GreetingController greetingController = new GreetingController();
    @Test
    void greeting() {
        Greeting greeting = new Greeting(1L, "Hello, Artur!");
        assertEquals(greeting.toString(), greetingController.greeting("Artur").toString());
    }
}