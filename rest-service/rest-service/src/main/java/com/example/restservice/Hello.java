package com.example.restservice;

import lombok.Getter;

public class Hello {
    private @Getter
    final String content;

    public Hello(String content) {
        this.content = content;
    }
}
