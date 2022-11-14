package com.devayush.level3Coding.exception;

public class PlayerAlreadyInAGame extends RuntimeException{
    public PlayerAlreadyInAGame() {
        super("Player already in a game");
    }
}
