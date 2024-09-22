package com.neo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/hello")
@RestController
public class HelloWorldController {
    @GetMapping
    public String index() {
        return "Hello World";
    }
}