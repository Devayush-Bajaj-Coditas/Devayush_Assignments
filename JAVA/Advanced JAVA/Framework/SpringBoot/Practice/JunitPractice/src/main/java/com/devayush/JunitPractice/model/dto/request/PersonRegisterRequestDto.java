package com.devayush.JunitPractice.model.dto.request;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class PersonRegisterRequestDto {
    @NotEmpty (message = "name is empty")
    @Size(min = 3, max = 12,message = "size not full filled")
    private String name;
    @Email (message = "email is empty")
    private String email;
    @NotEmpty(message = "Password is empty")
    private String password;
    @NotEmpty (message = "phone number not provided")
    private long phoneNumber;
}