package com.example.restservice;

import lombok.*;

@Value
@Builder
public class Greeting {

    long id;
    String content;
}
// https://spring.io/guides/gs/rest-service/#scratch