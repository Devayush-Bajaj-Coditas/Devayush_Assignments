package com.devayush.level3Coding.service;

import com.devayush.level3Coding.entity.MatchEntity;
import com.devayush.level3Coding.model.dto.request.GamePlayDto;
import com.devayush.level3Coding.model.dto.request.StartMatchDto;

public interface MatchService {
    public MatchEntity createNewMatch(StartMatchDto startMatchDto);

    public String playerAction(GamePlayDto gamePlayDto);
}
