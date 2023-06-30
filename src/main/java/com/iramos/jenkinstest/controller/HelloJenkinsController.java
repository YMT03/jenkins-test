package com.iramos.jenkinstest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

@RestController
public class HelloJenkinsController {

    @GetMapping("/app")
    public ResponseEntity<String> getHello() {
        return ResponseEntity.ok("Hello Jenkins!!");
    }

}
