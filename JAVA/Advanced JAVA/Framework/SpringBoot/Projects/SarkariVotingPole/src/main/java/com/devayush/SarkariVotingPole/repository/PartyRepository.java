package com.devayush.SarkariVotingPole.repository;

import com.devayush.SarkariVotingPole.entity.PartyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyRepository extends JpaRepository<PartyEntity , Long> {
}
