package com.example.restservice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {
    Greeting greeting = Greeting.builder().id(1).content("content").build();

    @Test
    void getGreetingId() {
        assertEquals(1, greeting.getId());
    }
    @Test
    void getGreetingContent() {
        assertEquals("content", greeting.getContent());
    }
}