package com.devayush.loginAndRegister.controller;

import com.devayush.loginAndRegister.entity.UserEntity;
import com.devayush.loginAndRegister.model.dto.LoginDto;
import com.devayush.loginAndRegister.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/registerNewUser")
    public ResponseEntity registerNewUser(@RequestBody UserEntity user){
        try{
            return new ResponseEntity(Optional.of(userService.registerNewUser(user)), HttpStatus.CREATED);
        }catch(Exception exception){
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/login")
    public ResponseEntity login (@RequestBody LoginDto loginDto){
        try{
        return new ResponseEntity(Optional.of(userService.loginUser(loginDto)),HttpStatus.CREATED);
        }catch (Exception exception){
        return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
        }
    }


    @GetMapping("/findById/{id}")
    public ResponseEntity findById(@PathVariable int id){
        try {
            return new ResponseEntity(Optional.of(userService.getById(id)), HttpStatus.OK);
        }catch(Exception exception){
            return new ResponseEntity(HttpStatus.BAD_GATEWAY);
        }
    }
}
