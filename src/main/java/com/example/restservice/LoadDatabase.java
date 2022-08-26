package com.example.restservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
    /*
    @Bean
    CommandLineRunner initDatabase(UserRepository userRepository){

        return args -> {
            userRepository.save(new Users("Artur", LocalDate.of(2001, Month.APRIL, 20), "artur@kreegipuu.net"));
            userRepository.save(new Users("Arturr", LocalDate.of(2002, Month.APRIL, 20), "arturr@kreegipuu.net"));
            userRepository.findAll().forEach(users -> log.info("Preloaded " + users));

        };
    }*/

}
