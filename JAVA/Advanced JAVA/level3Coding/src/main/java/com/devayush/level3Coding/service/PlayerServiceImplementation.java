package com.devayush.level3Coding.service;

import com.devayush.level3Coding.entity.MatchEntity;
import com.devayush.level3Coding.entity.PlayerEntity;
import com.devayush.level3Coding.model.dto.request.RegisterPlayerDto;
import com.devayush.level3Coding.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PlayerServiceImplementation implements PlayerService{
    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    PlayerEntity playerEntity;

    @Autowired
    MatchEntity matchEntity;

    @Override
    public PlayerEntity registerPlayer(RegisterPlayerDto playerDto) {
        playerEntity.setPlayerFirstName(playerDto.getPlayerFirstName());
        playerEntity.setPlayerLastName(playerDto.getPlayerLastName());
        playerEntity.setPlayerEmail(playerDto.getPlayerEmail());
        playerEntity.setPassword(playerDto.getPassword());
        return playerRepository.save(playerEntity);
    }



}
