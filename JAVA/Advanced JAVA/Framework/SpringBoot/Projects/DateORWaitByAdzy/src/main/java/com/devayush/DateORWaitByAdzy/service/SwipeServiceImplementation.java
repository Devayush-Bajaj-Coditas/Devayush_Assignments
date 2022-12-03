package com.devayush.DateORWaitByAdzy.service;

import com.devayush.DateORWaitByAdzy.entity.SwipeEntity;
import com.devayush.DateORWaitByAdzy.entity.UserEntity;
import com.devayush.DateORWaitByAdzy.exception.UserNotFoundException;
import com.devayush.DateORWaitByAdzy.repository.SwipeRepository;
import com.devayush.DateORWaitByAdzy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.security.auth.login.AccountNotFoundException;
import java.util.Optional;

public class SwipeServiceImplementation implements SwipeService {

    @Autowired
    SwipeRepository swipeRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    SwipeEntity swipe;
    @Override
    public ResponseEntity swipeRight(long id) {
        UserEntity swipeeDetials = userRepository.findById(id).orElse(null);
        try{
        if(swipeeDetials.equals(null)){
            throw new AccountNotFoundException("No account exist with the given Id");
        }
        else {
            swipe.setSwipeeId(id);
            return new ResponseEntity<>(Optional.of(swipeRepository.save(swipe)),HttpStatus.OK);

        }
        }catch(Exception exception){
            exception.printStackTrace();
            return new ResponseEntity<SwipeEntity>(HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @Override
    public ResponseEntity responseSwipe(long swiperId, Boolean response) {
        return null;
    }


    @Override
    public ResponseEntity getAllrequests(long id) {
        UserEntity user = userRepository.findById(id).orElse(null);
        try {
            if (user.equals(null)) {
                throw new UserNotFoundException("user with the given id has not found");
        }
            else {
                return new ResponseEntity(Optional.of(swipeRepository.findBySwipeeId(id)),HttpStatus.OK);
            }
        }catch (Exception exception){
            exception.printStackTrace();
            return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
        }
    }
}
