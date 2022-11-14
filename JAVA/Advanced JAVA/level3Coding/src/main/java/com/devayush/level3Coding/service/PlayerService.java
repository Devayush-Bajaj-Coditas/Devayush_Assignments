package com.devayush.level3Coding.service;

import com.devayush.level3Coding.entity.MatchEntity;
import com.devayush.level3Coding.entity.PlayerEntity;
import com.devayush.level3Coding.model.dto.request.RegisterPlayerDto;

public interface PlayerService {

    public PlayerEntity registerPlayer(RegisterPlayerDto playerDto);

}
