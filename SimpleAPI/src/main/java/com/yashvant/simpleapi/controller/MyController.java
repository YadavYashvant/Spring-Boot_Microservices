package com.yashvant.simpleapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/test")
    public String testingController(){
        return "It worked!";
    }

    @GetMapping("/hello")
    public String greet() {
        return "Hello Stranger!";
    }
}
