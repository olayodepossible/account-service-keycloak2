package com.possible.accountservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class MessageController {

    @GetMapping("/messages")
    public ResponseEntity<List<String>> getMessages(){
        return ResponseEntity.ok(Arrays.asList("first", "second"));
    }
}
