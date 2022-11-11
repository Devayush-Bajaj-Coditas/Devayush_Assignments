package com.devayush.SarkariVotingPole.service;

import com.devayush.SarkariVotingPole.entity.UserEntity;
import com.devayush.SarkariVotingPole.model.dto.UserRegistrationDto;
import com.devayush.SarkariVotingPole.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    UserRegistrationDto userRegistrationDto;

    @Autowired
    UserEntity userEntity;


    public ResponseEntity registerUser(UserRegistrationDto user){

        userEntity.setFirstName(user.getFirstName());
        userEntity.setLastName(user.getLastName());
        userEntity.setUserEmail(user.getUserEmail());
        userEntity.setPassword(user.getPassword());
        userEntity.setUserAge(user.getUserAge());
        Random random = new Random();
        int randomNumber = random.nextInt(10000000-100000000)+10000000;
        userEntity.setVoterId(randomNumber);
        try {
            return new ResponseEntity(Optional.of(userRepository.save(userEntity)), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    public String giveVote(String partyName){

    }

}
