package com.example.restservice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import lombok.Value;

@Value
public class Greeting {

    long id;
    String content;
}
// https://spring.io/guides/gs/rest-service/#scratch