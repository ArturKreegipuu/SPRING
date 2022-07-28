package com.example.restservice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {
    @Test
    void getHelloContent(){
        Hello hello = new Hello("content");
        assertEquals("content", hello.getContent());
    }
}