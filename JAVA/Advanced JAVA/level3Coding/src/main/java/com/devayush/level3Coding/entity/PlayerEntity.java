package com.devayush.level3Coding.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Component
public class PlayerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long playerId;
    private String playerFirstName;
    private String playerLastName;
    private String playerEmail;
    private String password;
    private String playerStatus;
    private int playerScore;



    @OneToMany(mappedBy = "playerEntity", cascade = CascadeType.ALL)
    private List<LeaderBoardEntity> leaderBoardEntities = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "player_entity_match_entities",
            joinColumns = @JoinColumn(name = "player_entity"),
            inverseJoinColumns = @JoinColumn(name = "match_entities"))
    private List<MatchEntity> matchEntities = new ArrayList<>();

}
