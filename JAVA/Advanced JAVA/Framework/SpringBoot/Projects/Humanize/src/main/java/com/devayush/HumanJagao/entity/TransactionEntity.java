package com.devayush.HumanJagao.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class TransactionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long transactionId;
    int noOfAnimalsfeeded;


    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "transactionEntity_userEntities",
            joinColumns = @JoinColumn(name = "transactionEntity_null"),
            inverseJoinColumns = @JoinColumn(name = "userEntities_null"))
    private List<UserEntity> userEntities = new ArrayList<>();

    @ManyToMany(mappedBy = "transactionEntities", cascade = CascadeType.MERGE)
    private List<AreaEntity> areaEntities = new ArrayList<>();


}
