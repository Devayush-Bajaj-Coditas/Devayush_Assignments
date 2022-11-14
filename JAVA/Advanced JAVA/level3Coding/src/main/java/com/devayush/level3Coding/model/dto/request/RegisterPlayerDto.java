package com.devayush.level3Coding.model.dto.request;

import lombok.Data;

@Data
public class RegisterPlayerDto {
    private String playerFirstName;
    private String playerLastName;
    private String playerEmail;
    private String password;
}
