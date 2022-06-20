package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TervitusController {
    private static final String template = "Tere, %s";
    @GetMapping("/tervitus")
    public Tervitus tervitus(@RequestParam(value = "name", defaultValue = "Maailm") String name) {
        return new Tervitus(String.format(template, name));
    }
}
