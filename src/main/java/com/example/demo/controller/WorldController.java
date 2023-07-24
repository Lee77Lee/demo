package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class WorldController {

    @GetMapping("/1")
    public ResponseEntity<String> get1() {
        String message = "Hello 1!";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/2")
    public ResponseEntity<String> get2() {
        String message = "Hello 2!";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}

