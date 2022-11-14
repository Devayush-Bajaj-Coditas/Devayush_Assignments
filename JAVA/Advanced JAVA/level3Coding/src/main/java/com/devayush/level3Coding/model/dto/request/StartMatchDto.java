package com.devayush.level3Coding.model.dto.request;

import lombok.Data;

@Data
public class StartMatchDto {
    private long playerOneId;
    private long playerTwoId;
    private String matchName;
}
