package com.devayush.HumanJagao.contoller;

import com.devayush.HumanJagao.dto.request.CustomerRegistrationDto;
import com.devayush.HumanJagao.service.UserService;
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

    @PostMapping("/register")
    public ResponseEntity registerUser(CustomerRegistrationDto customerRegistrationDto){
        return new ResponseEntity(userService.registerUser(customerRegistrationDto), HttpStatus.CREATED);
    }
}
