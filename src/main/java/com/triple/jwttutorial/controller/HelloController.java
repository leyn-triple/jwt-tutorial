package com.triple.jwttutorial.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
  public ResponseEntity<String> hello(){
    return ResponseEntity.ok("hello");
  }
}
