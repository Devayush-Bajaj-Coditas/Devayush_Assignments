package com.devayush.SarkariVotingPole.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Component
public class PartyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long partyId;
    String partyName;
    String partySymbol;

    @OneToMany(mappedBy = "partyEntity")
    private List<UserEntity> userEntities = new ArrayList<>();

}
