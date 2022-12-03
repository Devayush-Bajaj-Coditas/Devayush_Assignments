package com.devayush.ExceptionHandlingDEMO.service;

import com.devayush.ExceptionHandlingDEMO.exception.NewException;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String msg(){
        boolean warning = true;
        if(warning){
            throw new NullPointerException("WARNING!!WARNING!!WARNING!!");
        }
        return "This is simple msg";
    }


    public String CustomMsg(String msg){
        if(msg.equalsIgnoreCase("java")){
           return "Hello java";
        }
        throw new NewException("Not JAVA");
    }


}