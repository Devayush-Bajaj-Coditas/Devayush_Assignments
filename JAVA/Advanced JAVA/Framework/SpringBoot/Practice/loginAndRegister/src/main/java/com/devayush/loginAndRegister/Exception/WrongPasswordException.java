package com.devayush.loginAndRegister.Exception;

public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException() {
        super("Password does not match");
    }
}
