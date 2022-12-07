package com.devayush.HumanJagao.dto.request;

import lombok.Data;

@Data
public class CustomerRegistrationDto
{
    String userName;
    String userEmail;
    String userPassword;
    String userRole;
    String userContactNo;
}
