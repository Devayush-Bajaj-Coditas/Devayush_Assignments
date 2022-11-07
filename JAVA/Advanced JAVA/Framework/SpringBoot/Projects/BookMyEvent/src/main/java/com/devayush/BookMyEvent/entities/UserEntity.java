package com.devayush.BookMyEvent.entities;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int userId;
    private String email;
    private String password;
    private String role;
}
