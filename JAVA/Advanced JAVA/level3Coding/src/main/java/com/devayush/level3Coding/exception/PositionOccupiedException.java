package com.devayush.level3Coding.exception;

public class PositionOccupiedException extends RuntimeException{
    public PositionOccupiedException() {
        super("Position already occupied by other user");
    }
}
