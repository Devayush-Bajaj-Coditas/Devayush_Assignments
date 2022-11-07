package com.devayush.BookMyEvent.controller;

import com.devayush.BookMyEvent.entities.UserEntity;
import com.devayush.BookMyEvent.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserService userService;


    @PostMapping(name = "/login")
    public ResponseEntity login(UserEntity user){
        try {
            return new ResponseEntity(Optional.of(userService.findUserByRole(user)), (HttpStatus.OK));
        }
        catch (Exception exception){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        }
}
