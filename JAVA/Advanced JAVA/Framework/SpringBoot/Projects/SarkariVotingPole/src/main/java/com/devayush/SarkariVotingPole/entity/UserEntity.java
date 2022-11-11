package com.devayush.SarkariVotingPole.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.servlet.http.Part;

@Entity
@Data
@Component
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long userId;
    String firstName;
    String LastName;
    String userEmail;
    String password;
    long voterId;
    float userAge;
    boolean votingStatus;


    @ManyToOne()
    private PartyEntity partyEntity;


}
