package com.devayush.SarkariVotingPole.repository;

import com.devayush.SarkariVotingPole.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
