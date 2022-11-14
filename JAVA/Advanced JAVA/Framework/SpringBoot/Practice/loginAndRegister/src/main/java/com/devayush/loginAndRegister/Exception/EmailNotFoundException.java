package com.devayush.loginAndRegister.Exception;

public class EmailNotFoundException extends RuntimeException{
    public EmailNotFoundException() {
        super("no user found with the given email");
    }
}
