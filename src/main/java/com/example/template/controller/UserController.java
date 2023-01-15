package com.example.template.controller;

//import org.slf4j.LoggerFactory;
//import org.slf4j.Logger;

import com.example.template.dto.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// @Slf4j
@RestController
public class UserController {
//    private static Logger LOG = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/hello")
    public String hello() {
        String message = "Hello, World!";
        return message;
    }

    @PostMapping("/user")
    public ResponseEntity<Boolean> createUser(@RequestBody UserDTO userDTO) {
        return null;
    }

}
