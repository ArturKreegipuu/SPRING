package com.example.restservice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    @Test
    void getGreetingGetters() {
        Greeting greeting = new Greeting(1, "content");
        System.out.println("Greeting id: " + greeting.getId() + " greeting content: " + greeting.getContent());
        // "Greeting id: 1 greeting content: content"
    }
}