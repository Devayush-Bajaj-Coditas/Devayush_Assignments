package com.devayush.level3Coding.service;

import com.devayush.level3Coding.entity.MatchEntity;
import com.devayush.level3Coding.entity.PlayerEntity;
import com.devayush.level3Coding.model.dto.request.StartMatchDto;
import com.devayush.level3Coding.repository.MatchRepository;
import com.devayush.level3Coding.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class MatchServiceImplementation implements MatchService {


    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    PlayerEntity playerEntity;

    @Autowired
    MatchEntity matchEntity;

    @Autowired
    MatchRepository matchRepository;

    @Override
    public MatchEntity createNewMatch(StartMatchDto startMatchDto){
        PlayerEntity playerOne = playerRepository.findById(startMatchDto.getPlayerOneId()).orElse(null);
        PlayerEntity playerTwo = playerRepository.findById(startMatchDto.getPlayerTwoId()).orElse(null);
        playerOne.setPlayerStatus("In a game");
        playerTwo.setPlayerStatus("in a game");
        List<PlayerEntity> playersEnrolled = new ArrayList<>();
        playersEnrolled.add(playerOne);
        playersEnrolled.add(playerTwo);
        matchEntity.setPlayers(playersEnrolled);
        matchEntity.setMatchName(startMatchDto.getMatchName());
        playerRepository.save(playerOne);
        playerRepository.save(playerTwo);
        return matchRepository.save(matchEntity);
    }


}
