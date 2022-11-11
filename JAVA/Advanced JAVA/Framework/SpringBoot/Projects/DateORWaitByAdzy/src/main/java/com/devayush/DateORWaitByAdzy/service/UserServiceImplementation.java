package com.devayush.DateORWaitByAdzy.service;

import com.devayush.DateORWaitByAdzy.entity.UserEntity;
import com.devayush.DateORWaitByAdzy.repository.SwipeRepository;
import com.devayush.DateORWaitByAdzy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation  implements UserService{
    @Autowired
    UserRepository userRepository;


    @Override
    public UserEntity registerUser(UserEntity user) {
       return userRepository.save(user);
    }

    @Override
    public UserEntity fetchProfile(long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public UserEntity updateProfile(UserEntity newUserData) {
        UserEntity oldUserData = userRepository.findById(newUserData.getUserId()).orElse(null);
        oldUserData.setUserEmail(newUserData.getUserEmail());
        oldUserData.setUserPassword(newUserData.getUserPassword());
        oldUserData.setUserLastName(newUserData.getUserLastName());
        oldUserData.setUserFirstName(newUserData.getUserFirstName());
        oldUserData.setUserPhoneNumber(newUserData.getUserPhoneNumber());
        return userRepository.save(oldUserData);
    }
}
