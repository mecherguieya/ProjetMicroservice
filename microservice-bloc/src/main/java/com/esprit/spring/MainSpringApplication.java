package com.esprit.spring;

import com.esprit.spring.entities.Bloc;
import com.esprit.spring.repo.BlocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

//@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class MainSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainSpringApplication.class, args);
    }
    @Autowired
    BlocRepository blocRepository;

    @Bean
    ApplicationRunner init(){
        return (args -> {
           blocRepository.save(new Bloc("A",200L));
           blocRepository.save(new Bloc("B",400L));
           blocRepository.save(new Bloc("C",600L));
           blocRepository.findAll().forEach(System.out::println);
        });
    }

}
