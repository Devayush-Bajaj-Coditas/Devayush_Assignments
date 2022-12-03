package com.devayush.JunitPractice.model.dto.request;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class LoginDto {
    @NotEmpty
    @Email(message = "invalid email format")
    String email;

    @NotEmpty
    @Size(min = 5, max = 10)
    String password;



}
