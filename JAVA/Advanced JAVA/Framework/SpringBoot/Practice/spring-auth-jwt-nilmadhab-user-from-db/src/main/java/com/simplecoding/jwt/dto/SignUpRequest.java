package com.simplecoding.jwt.dto;

import lombok.Data;

import javax.validation.constraints.*;


@Data
public class SignUpRequest {

    @NotBlank
    @Size(max = 40)
    @Email
    private String email;

    @NotBlank
    @Size(min = 6, max = 20)
    private String password;

    private long phoneNumber;

    private String city;
}
