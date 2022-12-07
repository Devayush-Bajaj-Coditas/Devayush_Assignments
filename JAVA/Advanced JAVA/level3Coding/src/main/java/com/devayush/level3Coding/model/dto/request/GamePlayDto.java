package com.devayush.level3Coding.model.dto.request;

import lombok.Data;

@Data
public class GamePlayDto
{
    private int playerNumber;
    private float coordinatesX;
    private float coordinatesY;
    private String action;
    private int playerOneHealth = 100;
    private int playerTwoHealth = 100;
    private String moveDirection;
}
