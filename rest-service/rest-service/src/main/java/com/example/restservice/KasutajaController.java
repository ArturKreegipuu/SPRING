package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
public class KasutajaController {
    @GetMapping("/kasutaja")
    public List<Kasutaja> tere(){
        return List.of(new Kasutaja("Artur", 21, LocalDate.of(2001, Month.APRIL, 20), "artur@kreegipuu.net"));
    }



}
