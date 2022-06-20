package com.example.restservice;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class KasutajaService {
    private final AtomicLong counter = new AtomicLong();
    public List<Kasutaja> getKasutaja(){
        return List.of(new Kasutaja(counter.incrementAndGet(), "Artur", LocalDate.of(2001, Month.APRIL, 20), "artur@kreegipuu.net"));
    }
}
