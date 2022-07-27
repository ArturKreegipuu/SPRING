package com.example.restservice;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Greeting {

    private final long id;
    private final String content;


    /*public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }*/
}
// https://spring.io/guides/gs/rest-service/#scratch