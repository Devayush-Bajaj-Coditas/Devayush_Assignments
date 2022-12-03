package com.devayush.ExceptionHandlingDEMO.exception;

import lombok.Data;

@Data
public class NewException extends RuntimeException{
    public NewException(String message) {
        super(message);
    }
}
