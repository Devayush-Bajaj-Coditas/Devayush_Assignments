package com.devayush.loginAndRegister.service;

import com.devayush.loginAndRegister.entity.UserEntity;
import com.devayush.loginAndRegister.model.dto.LoginDto;
import com.devayush.loginAndRegister.repository.UserRepository;
import com.devayush.loginAndRegister.utils.UserAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserAuthentication userAuthentication;

    @Override
    public UserEntity registerNewUser(UserEntity user) {
        return userRepository.save(user);
    }

    @Override
    public String loginUser(LoginDto loginDto) {
        String role =  userAuthentication.authenticateUser(loginDto);
        if(role.equalsIgnoreCase("teacher")){
            return "Hello teacher";
        }
        else if(role.equalsIgnoreCase("student")){
            return "Hello Student";
        }
        else if(role.equalsIgnoreCase("admin")){
            return "Hello admin";
        }
        else
            return "Hello" + role;
    }
    @Override
    public UserEntity getById(int id){
        return userRepository.findById(id).orElse(null);
    }
}
