package com.fiipractic.week1.controllers;

import com.fiipractic.week1.models.HelloWorldModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello")
    public HelloWorldModel hello(){
        return new HelloWorldModel("Hello, weordfsdfsdf!");
    }

}
