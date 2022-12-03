package com.devayush.practiceWithADZY.entity;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Data
@Entity

public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long userId;
    @NotBlank(message = "First is mandatory")
    String firstName;

    @NotBlank(message = "Last is mandatory")
    String lastName;

    @NotBlank(message = "Password is mandatory")

    String password;

    @NotBlank(message = "Email is mandatory")
    String email;

    @NotBlank(message = "Role is mandatory")
    String role;

    @NotBlank(message = "Mobile number is mandatory")
    long mobileNUmber;
}
