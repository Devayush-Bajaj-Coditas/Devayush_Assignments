package com.devayush.DateORWaitByAdzy.controller;


import com.devayush.DateORWaitByAdzy.entity.SwipeEntity;
import com.devayush.DateORWaitByAdzy.entity.UserEntity;
import com.devayush.DateORWaitByAdzy.service.SwipeService;
import com.devayush.DateORWaitByAdzy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    SwipeService swipeService;

    @PostMapping("/registerUser")
    public ResponseEntity registerUser (@RequestBody UserEntity user){
        try {
            return new ResponseEntity(Optional.of(userService.registerUser(user)), HttpStatus.CREATED);
        }catch (Exception exception){
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PutMapping("/update")
    public ResponseEntity updateProfile(@RequestBody UserEntity user){
        try {
            return new ResponseEntity(Optional.of(userService.updateProfile(user)), HttpStatus.OK);
        }catch (Exception exception){
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        }


    @GetMapping("seeMyProfile/{id}")
    public ResponseEntity fetchProfile(@PathVariable int id){
        try {
            return new ResponseEntity(Optional.of(userService.fetchProfile(id)), HttpStatus.OK);
        }catch (Exception exception){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/rightSwipe/{id}")
    public ResponseEntity swipeRight(long id){
        return swipeService.swipeRight(id);
    }
}
