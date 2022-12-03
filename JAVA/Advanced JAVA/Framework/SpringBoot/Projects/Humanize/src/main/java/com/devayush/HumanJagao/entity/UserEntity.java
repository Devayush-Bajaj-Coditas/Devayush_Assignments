package com.devayush.HumanJagao.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long userId;
    String userName;
    String userEmail;
    String userPassword;
    String userRole;
    String userContactNo;

    @ManyToMany(mappedBy = "userEntities")
    private List<TransactionEntity> transactionEntities = new ArrayList<>();

}
