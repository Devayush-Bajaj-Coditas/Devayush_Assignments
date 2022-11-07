package com.devayush.BookMyEvent.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "admin")
@Data
public class AdminEntity {
    @Id
    private int adminId;
    private String adminName;
    private String adminEmail;
    private String adminPassword;
}
