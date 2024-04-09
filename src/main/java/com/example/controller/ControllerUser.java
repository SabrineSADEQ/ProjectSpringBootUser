package com.example.controller;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.entity.EntityUser;
import com.example.service.ServiceUser;

@RestController
@RequestMapping("/api/users")
public class ControllerUser {

    private  ServiceUser userService;

    @Autowired
    public ControllerUser(ServiceUser userService) {
        this.userService = userService;
    }
     
    @PostMapping("/register")
    public ResponseEntity<Object> registerUser(@RequestBody @Valid EntityUser user) {
        try {
            EntityUser registeredUser = userService.registerUser(user);
            return new ResponseEntity<>(registeredUser, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}

