package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<String> getHello() {
        String message = "Hello China!";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/world")
    public ResponseEntity<String> getWorld() {
        String message = "Hello World!";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
