package com.devayush.practiceWithADZY.service;

import com.devayush.practiceWithADZY.dto.LoginDto;
import com.devayush.practiceWithADZY.entity.UserEntity;
import com.devayush.practiceWithADZY.exception.InvalidCredentialsException;
import com.devayush.practiceWithADZY.exception.UserNotFoundException;
import com.devayush.practiceWithADZY.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    @Lazy
    UserRepository userRepository;

    public UserEntity addUser(UserEntity user){
        return userRepository.save(user);
    }

    public List<UserEntity> getALlUsers (){
        return userRepository.findAll();
    }

    public String deleteUser(long id){
        userRepository.deleteById(id);
        return "User Deleted";
    }


    public UserEntity updateUser(UserEntity newUserData){
        UserEntity oldData = userRepository.findById(newUserData.getUserId()).orElse(null);
        if(oldData == null){
            throw new UserNotFoundException("No such user found with the given Id");
        }
        else {
            oldData.setEmail(newUserData.getEmail());
            oldData.setFirstName(newUserData.getFirstName());
            oldData.setPassword(newUserData.getPassword());
            oldData.setMobileNUmber(newUserData.getMobileNUmber());
            oldData.setRole(newUserData.getRole());
            oldData.setLastName(newUserData.getLastName());
        }
        return oldData;
    }


    public UserEntity userLogin(LoginDto loginDto){
        UserEntity user = userRepository.findByEmailLikeIgnoreCase(loginDto.getEmail()).orElse(null);
        if (user == null){
            throw new UserNotFoundException("invalid email");
        }
        else {
            if(loginDto.getPassword().equals(user.getPassword())) {
                return user;
            }
            else{
                throw new InvalidCredentialsException("invalid password");
            }
        }
    }


}
