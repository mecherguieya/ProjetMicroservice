package com.esprit.microservereurekaclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class MicroServiceReservationApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceReservationApplication.class, args);
    }
    @Autowired
    private EtudiantRepository repository;

    @Bean
    ApplicationRunner init(){
        return (args)-> {

        };
    }
}
