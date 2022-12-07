package com.devayush.level3Coding.service;

import com.devayush.level3Coding.entity.MatchEntity;
import com.devayush.level3Coding.entity.PlayerEntity;
import com.devayush.level3Coding.exception.PlayerAlreadyInAGame;
import com.devayush.level3Coding.model.dto.request.GamePlayDto;
import com.devayush.level3Coding.model.dto.request.StartMatchDto;
import com.devayush.level3Coding.repository.LeaderboardRepository;
import com.devayush.level3Coding.repository.MatchRepository;
import com.devayush.level3Coding.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class MatchServiceImplementation implements MatchService {

    float playerOneXCordinate = 0;
    float playerOneYCordinate = 0;
    float playerTwoXCordinate = 10;
    float playerTwoYCordinate = 10;
    String winner;
    String status;

    @Autowired
    PlayerRepository playerRepository;



    @Autowired
    LeaderboardRepository leaderboardRepository;

    @Autowired
    MatchEntity matchEntity;

    @Autowired
    MatchRepository matchRepository;



    @Override
    public MatchEntity createNewMatch(StartMatchDto startMatchDto){
        PlayerEntity playerOne = playerRepository.findById(startMatchDto.getPlayerOneId()).orElse(null);
        PlayerEntity playerTwo = playerRepository.findById(startMatchDto.getPlayerTwoId()).orElse(null);
        if(playerOne.getPlayerStatus().equalsIgnoreCase("in a game") || playerTwo.getPlayerStatus().equalsIgnoreCase("In a game")) {
            throw new PlayerAlreadyInAGame();
        }
        else{
            playerOne.setPlayerStatus("In a game");
            playerTwo.setPlayerStatus("In a game");
            List<PlayerEntity> playersEnrolled = new ArrayList<>();
            playersEnrolled.add(playerOne);
            playersEnrolled.add(playerTwo);
            matchEntity.setPlayerEntities(playersEnrolled);
            matchEntity.setMatchName(startMatchDto.getMatchName());
            playerRepository.save(playerOne);
            playerRepository.save(playerTwo);
            return matchRepository.save(matchEntity);
            }

    }

    @Override
    public String playerAction(GamePlayDto gamePlayDto) {
        String action = gamePlayDto.getAction();
        if (action.equalsIgnoreCase("hit")) {
            int playerNumber = gamePlayDto.getPlayerNumber();
            if (playerNumber == 1) {
                if (gamePlayDto.getCoordinatesX() == playerOneXCordinate && gamePlayDto.getCoordinatesY() == playerOneYCordinate) {
                    gamePlayDto.setPlayerOneHealth(-20);
                    status += "player one got hit" + gamePlayDto.getPlayerOneHealth() + "Health left";
                } else
                    return status += "you have missed the attack";
            } else if (playerNumber == 2) {
                if (gamePlayDto.getCoordinatesX() == playerTwoXCordinate && gamePlayDto.getCoordinatesY() == playerTwoYCordinate) {
                    gamePlayDto.setPlayerTwoHealth(-20);
                    status += "player two got hit" + gamePlayDto.getPlayerTwoHealth() + "Health left";
                } else
                    status += "you have missed the attack";
            }

        } else if (action.equalsIgnoreCase("move")) {
            int playerNumber = gamePlayDto.getPlayerNumber();
            if (playerNumber == 1) {
                if (gamePlayDto.getMoveDirection().equalsIgnoreCase("right")) {
                    playerOneXCordinate = +1;
                    status += "current location of player 1\nX: " + playerOneXCordinate + "\n" + "Y: " + playerOneYCordinate +
                            "current location of player 2\nX: " + playerTwoXCordinate + "\n" + "Y: " + playerTwoYCordinate;
                } else if (gamePlayDto.getMoveDirection().equalsIgnoreCase("left")) {
                    playerOneXCordinate = -1;
                    status += "current location of player 1\nX: " + playerOneXCordinate + "\n" + "Y: " + playerOneYCordinate +
                            "current location of player 2\nX: " + playerTwoXCordinate + "\n" + "Y: " + playerTwoYCordinate;
                } else if (gamePlayDto.getMoveDirection().equalsIgnoreCase("up")) {
                    playerOneYCordinate = +1;
                    status += "current location of player 1\nX: " + playerOneXCordinate + "\n" + "Y: " + playerOneYCordinate +
                            "current location of player 2\nX: " + playerTwoXCordinate + "\n" + "Y: " + playerTwoYCordinate;
                } else if (gamePlayDto.getMoveDirection().equalsIgnoreCase("down")) {
                    playerOneYCordinate = -1;
                    status += "current location of player 1\nX: " + playerOneXCordinate + "\n" + "Y: " + playerOneYCordinate +
                            "current location of player 2\nX: " + playerTwoXCordinate + "\n" + "Y: " + playerTwoYCordinate;
                }

            } else if (playerNumber == 2) {
                 if (gamePlayDto.getMoveDirection().equalsIgnoreCase("right")) {
                    playerTwoXCordinate = +1;
                    status += "current location of player 1\nX: " + playerOneXCordinate + "\n" + "Y: " + playerOneYCordinate +
                            "current location of player 2\nX: " + playerTwoXCordinate + "\n" + "Y: " + playerTwoYCordinate;
                } else if (gamePlayDto.getMoveDirection().equalsIgnoreCase("left")) {
                    playerTwoXCordinate = -1;
                    status += "current location of player 1\nX: " + playerOneXCordinate + "\n" + "Y: " + playerOneYCordinate +
                            "current location of player 2\nX: " + playerTwoXCordinate + "\n" + "Y: " + playerTwoYCordinate;
                } else if (gamePlayDto.getMoveDirection().equalsIgnoreCase("up")) {
                    playerTwoYCordinate = +1;
                    status += "current location of player 1\nX: " + playerOneXCordinate + "\n" + "Y: " + playerOneYCordinate +
                            "current location of player 2\nX: " + playerTwoXCordinate + "\n" + "Y: " + playerTwoYCordinate;
                } else if (gamePlayDto.getMoveDirection().equalsIgnoreCase("down")) {
                    playerTwoYCordinate = -1;
                    status += "current location of player 1\nX: " + playerOneXCordinate + "\n" + "Y: " + playerOneYCordinate +
                            "current location of player 2\nX: " + playerTwoXCordinate + "\n" + "Y: " + playerTwoYCordinate;
                }
                status += "player two moved";
            }
        }
        if (gamePlayDto.getPlayerOneHealth() <= 0) {
            winner =  "Player 2 won";

        } else if (gamePlayDto.getPlayerTwoHealth() >= 0) {
            winner = "player 1 won";
        }
        return status;
    }
}
