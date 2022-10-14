package com.devayush.ToolManagementSystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
public class UserEntity {
    @Id
    private int userId;
    private String username;
    private String password;
    private String role;
}
