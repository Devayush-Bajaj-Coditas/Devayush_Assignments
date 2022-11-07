package com.devayush.BookMyEvent.model.dto;

import lombok.Data;

@Data
public class CustomerPasswordDto {
    int id;
    String currentPassword;
    String password;
}
