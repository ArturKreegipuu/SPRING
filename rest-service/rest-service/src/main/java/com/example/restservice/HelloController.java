package com.example.restservice;

import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ToString
public class HelloController {
    private static final String template = "Tere, %s";
    @GetMapping("/hello")
    public Hello hello(@RequestParam(value = "name", defaultValue = "Maailm") String name) {
        return new Hello(String.format(template, name));
    }
}
