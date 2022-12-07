package com.devayush.loginAndRegister.utils;

import com.devayush.loginAndRegister.Exception.EmailNotFoundException;
import com.devayush.loginAndRegister.Exception.WrongPasswordException;
import com.devayush.loginAndRegister.entity.UserEntity;
import com.devayush.loginAndRegister.model.dto.LoginDto;
import com.devayush.loginAndRegister.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserAuthentication {
    @Autowired
    UserRepository userRepository;


    public String authenticateUser(LoginDto loginData) {
        UserEntity user = userRepository.findByEmail(loginData.getEmail()).orElse(null);

        if (user.equals(null)) {
            throw new EmailNotFoundException();
        } else {
            if (loginData.getPassword().equals(user.getPassword())) {
                return user.getRole();
            } else {
                throw new WrongPasswordException();
            }
        }
    }
}
