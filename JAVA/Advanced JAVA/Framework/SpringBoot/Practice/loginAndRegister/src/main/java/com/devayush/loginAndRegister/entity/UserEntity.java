package com.devayush.loginAndRegister.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
@Data
@Entity
@Component
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int userId;
    String role;
    String userName;
    String password;
    long phoneNumber;
    String email;




}
