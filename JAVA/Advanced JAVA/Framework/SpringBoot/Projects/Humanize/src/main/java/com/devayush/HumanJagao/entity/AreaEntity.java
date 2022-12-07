package com.devayush.HumanJagao.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class AreaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long areaId;
    String areaName;
    String areaAddress;

    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "areaEntity_transactionEntities",
            joinColumns = @JoinColumn(name = "areaEntity_null"),
            inverseJoinColumns = @JoinColumn(name = "transactionEntities"))
    private List<TransactionEntity> transactionEntities = new ArrayList<>();
}
