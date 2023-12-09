package com.esprit.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class MainSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainSpringApplication.class, args);
    }
    @Autowired
    private FoyerRepository foyerRepository;

    @Bean
    ApplicationRunner init(){
        return (args)-> {
            //Save
            foyerRepository.save(new Foyer("ISDjerba",20L));
            foyerRepository.save(new Foyer("ISTunisie",10L));
            foyerRepository.findAll().forEach(System.out::println);
        };
    }
}
