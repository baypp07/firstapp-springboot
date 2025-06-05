package com.giustipp.firstapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    public String display(){
        return "Hello Phetsavanh";
    }

    @GetMapping("/about")
    public String about(){
        return "this is about page";
    }

    @GetMapping("/api")
    public String api(){
        return "Test api";
    }
}
