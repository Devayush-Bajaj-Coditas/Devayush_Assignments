package com.devayush.level3Coding.repository;

import com.devayush.level3Coding.entity.LeaderBoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaderboardRepository extends JpaRepository<LeaderBoardEntity , Long> {
}
