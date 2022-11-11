package com.simplecoding.jwt.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
public class JwtUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    private long phoneNumber;

    private String city;
}
