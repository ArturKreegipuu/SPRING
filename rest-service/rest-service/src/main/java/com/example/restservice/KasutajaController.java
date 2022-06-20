package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
public class KasutajaController {

    private final KasutajaService kasutajaService;

    @Autowired
    public KasutajaController(KasutajaService kasutajaService) {
        this.kasutajaService = kasutajaService;
    }

    @GetMapping("/kasutaja")
    public List<Kasutaja> getKasutaja(){
        return kasutajaService.getKasutaja();
    }



}
