package com.devayush.ExceptionHandlingDEMO.controller;

import com.devayush.ExceptionHandlingDEMO.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/msg")
    public String getMsg(){
        return userService.msg();
    }

    @GetMapping("/customMsg/{msg}")
    public String getCustomMsg(@PathVariable String msg){
        return userService.CustomMsg(msg);
    }
}
