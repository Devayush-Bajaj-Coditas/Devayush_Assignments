package com.devayush.loginAndRegister.service;

import com.devayush.loginAndRegister.entity.UserEntity;
import com.devayush.loginAndRegister.model.dto.LoginDto;

public interface UserService {

    public UserEntity registerNewUser(UserEntity user);

    public String loginUser(LoginDto loginDto);

    public UserEntity getById(int id);

}
