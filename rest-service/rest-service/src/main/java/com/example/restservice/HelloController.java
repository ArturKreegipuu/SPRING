package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private static final String template = "Tere, %s";
    @GetMapping("/hello")
    public Hello hello(@RequestParam(value = "name", defaultValue = "Maailm") String name) {
        return new Hello(String.format(template, name));
    }
}
