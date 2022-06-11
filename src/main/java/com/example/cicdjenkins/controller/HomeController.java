package com.example.cicdjenkins.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HomeController {

    @GetMapping("/home")
    public ResponseEntity<String> getHello(@RequestParam(required = false) String name) {
        String s = name != null ? name : "guest";
        return new ResponseEntity<>("Hello, " + s + "!!", HttpStatus.OK);
    }

}
