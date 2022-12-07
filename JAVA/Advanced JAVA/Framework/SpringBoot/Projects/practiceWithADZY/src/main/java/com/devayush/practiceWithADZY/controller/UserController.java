package com.devayush.practiceWithADZY.controller;

import com.devayush.practiceWithADZY.dto.LoginDto;
import com.devayush.practiceWithADZY.entity.UserEntity;
import com.devayush.practiceWithADZY.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    @Lazy
    UserService userService;

    @PostMapping("/register")
    public ResponseEntity addUser(@Valid @RequestBody UserEntity user) {
        try {
            return new ResponseEntity(userService.addUser(user), HttpStatus.OK);
        }catch (Exception exception){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/getAll")
    public ResponseEntity getAllUsers(){
        return new ResponseEntity(userService.getALlUsers(),HttpStatus.OK);
    }

    @PostMapping("/updateUser")
    public ResponseEntity updateUser(@RequestBody UserEntity user){
        return new ResponseEntity(userService.updateUser(user),HttpStatus.OK);

    }

    @DeleteMapping("/deleteUser/{id}")
    public ResponseEntity deleteUser(@PathVariable int id){
        return new ResponseEntity(userService.deleteUser(id),HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity loginUser(@RequestBody LoginDto loginDto){
        return new ResponseEntity(userService.userLogin(loginDto),HttpStatus.OK);
    }

    @GetMapping("/logInPage")
    public String loginPage(){
        return "register.html";
    }

    @GetMapping(value = "/log" ,produces = "text/HTML")
    public String loginPagee()
    {
        return "login.html";
    }

}
