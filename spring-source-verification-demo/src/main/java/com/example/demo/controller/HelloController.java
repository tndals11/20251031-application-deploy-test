package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*; // ⚠️ 불필요한 import (의도적)

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello Spring Boot!";
    }
}
