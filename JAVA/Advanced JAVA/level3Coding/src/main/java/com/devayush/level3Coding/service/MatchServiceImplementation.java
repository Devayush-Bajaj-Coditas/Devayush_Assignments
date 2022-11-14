package com.devayush.level3Coding.service;

import com.devayush.level3Coding.entity.MatchEntity;
import com.devayush.level3Coding.entity.PlayerEntity;
import com.devayush.level3Coding.exception.PlayerAlreadyInAGame;
import com.devayush.level3Coding.model.dto.request.GamePlayDto;
import com.devayush.level3Coding.model.dto.request.PlayerMoveDto;
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
    float playerTwoXCordinate = 0;
    float playerTwoYCordinate = 0;

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
    public String playerAction(GamePlayDto gamePlayDto){
        String action = gamePlayDto.getAction();
        int playerOneHealth = gamePlayDto.getPlayerOneHealth();
        int playerTwoHealth = gamePlayDto.getPlayerTwoHealth();
        if(action.equalsIgnoreCase("hit")){
            int playerNumber = gamePlayDto.getPlayerNumber();
            if (playerNumber == 1){
                if(gamePlayDto.getCoordinatesX() == playerOneXCordinate && gamePlayDto.getCoordinatesY() == playerOneYCordinate){
                    gamePlayDto.setPlayerOneHealth(-20);
                    return "player one got hit" + gamePlayDto.getPlayerOneHealth() + "Health left";
                }
                else
                    return "you have missed the attack";
            }
            else if (playerNumber == 2){
                if(gamePlayDto.getCoordinatesX() == playerTwoXCordinate && gamePlayDto.getCoordinatesY() == playerTwoYCordinate){
                    gamePlayDto.setPlayerTwoHealth(-20);
                    return "player two got hit" + gamePlayDto.getPlayerOneHealth() + "Health left";
                }
                else
                    return "you have missed the attack";
            }

        }

        else if (action.equalsIgnoreCase("move")){
            int playerNumber = gamePlayDto.getPlayerNumber();
            if (playerNumber == 1){
                playerOneXCordinate = gamePlayDto.getCoordinatesX();
                playerOneYCordinate = gamePlayDto.getCoordinatesY();
                return "player one moved";
            }
            else if (playerNumber == 2){
                playerTwoXCordinate = gamePlayDto.getCoordinatesX();
                playerTwoYCordinate = gamePlayDto.getCoordinatesY();
                return "player two moved";
            }
        }
        if(playerOneHealth <= 0){
            return  "Player 2 won";

        }
        else
            return "player 1 won";
    }

}
