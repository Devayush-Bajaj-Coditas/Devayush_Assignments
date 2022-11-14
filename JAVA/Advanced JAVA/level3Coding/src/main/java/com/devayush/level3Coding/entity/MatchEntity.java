package com.devayush.level3Coding.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Component
public class MatchEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long matchId;
    private String matchName;
    private int winnerId;


    @OneToMany(mappedBy = "matchEntity", cascade = CascadeType.ALL)
    private List<PlayerEntity> players = new ArrayList<>();


}
