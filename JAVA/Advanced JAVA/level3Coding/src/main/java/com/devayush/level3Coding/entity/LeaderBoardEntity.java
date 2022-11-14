package com.devayush.level3Coding.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Data
@Entity
@Component
public class LeaderBoardEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long leaderBoardId;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "player_Id")
    private PlayerEntity playerEntity;

    private int totalScores;

}
