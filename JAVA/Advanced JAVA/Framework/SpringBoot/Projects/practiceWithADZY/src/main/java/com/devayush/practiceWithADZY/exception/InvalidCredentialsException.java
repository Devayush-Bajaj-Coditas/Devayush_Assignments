package com.devayush.practiceWithADZY.exception;

import lombok.Data;

@Data
public class InvalidCredentialsException extends RuntimeException{

    public InvalidCredentialsException(String message) {
        super(message);
    }
}
