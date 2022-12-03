package com.devayush.HumanJagao.service;

import com.devayush.HumanJagao.dto.request.CustomerRegistrationDto;
import com.devayush.HumanJagao.entity.UserEntity;
import com.devayush.HumanJagao.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    public UserEntity registerUser (CustomerRegistrationDto customerRegistrationDto){
        UserEntity user = new UserEntity();
        user.setUserEmail(customerRegistrationDto.getUserEmail());
        user.setUserContactNo(customerRegistrationDto.getUserContactNo());
        user.setUserPassword(passwordEncoder.encode(customerRegistrationDto.getUserPassword()));
        user.setUserRole(customerRegistrationDto.getUserRole());
        user.setUserName(customerRegistrationDto.getUserName());
        return userRepository.save(user);
    }



}
