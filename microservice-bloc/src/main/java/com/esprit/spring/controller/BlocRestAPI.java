package com.esprit.spring.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlocRestAPI {

    private final String title="Hello, I am the bloc microservice !";

    @RequestMapping("/hello")
    public String sayHello(){
        return title;
    }

}
