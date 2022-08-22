package com.example.restservice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Greeting {

    private final long id;
    private final String content;
}
// https://spring.io/guides/gs/rest-service/#scratch