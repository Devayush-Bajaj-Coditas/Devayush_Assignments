package com.devayush.loginAndRegister.model.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class LoginDto {
    String email;
    String password;
}
