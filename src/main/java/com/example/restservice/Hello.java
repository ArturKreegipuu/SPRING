package com.example.restservice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Hello {
    private @Getter
    final String content;

}
