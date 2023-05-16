package com.sandbox.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/")
public class DemoController {
    private static final String template = "Hello, %s!";

    @GetMapping("")
    public String index() { 
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/hello")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format(template, name);
    }

}