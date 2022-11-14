package com.devayush.loginAndRegister.service;

import com.devayush.loginAndRegister.entity.UserEntity;
import com.devayush.loginAndRegister.model.dto.LoginDto;

public interface UserService {

    public UserEntity registerNewUser(UserEntity user);

    public UserEntity loginUser(LoginDto loginDto);

}
