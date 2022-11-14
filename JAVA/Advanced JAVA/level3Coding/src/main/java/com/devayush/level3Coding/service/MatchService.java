package com.devayush.level3Coding.service;

import com.devayush.level3Coding.entity.MatchEntity;
import com.devayush.level3Coding.model.dto.request.StartMatchDto;

public interface MatchService {
    public MatchEntity createNewMatch(StartMatchDto startMatchDto);
}
