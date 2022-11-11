package com.devayush.DateORWaitByAdzy.service;

import com.devayush.DateORWaitByAdzy.entity.UserEntity;

public interface UserService {

    public UserEntity registerUser(UserEntity user);

    public  UserEntity fetchProfile(long id);

    public UserEntity updateProfile(UserEntity user);

}

