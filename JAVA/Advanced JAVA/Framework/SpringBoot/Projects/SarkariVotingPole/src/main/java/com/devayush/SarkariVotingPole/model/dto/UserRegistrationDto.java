package com.devayush.SarkariVotingPole.model.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class UserRegistrationDto {
    String firstName;
    String LastName;
    float userAge;
    String userEmail;
    String password;


}
