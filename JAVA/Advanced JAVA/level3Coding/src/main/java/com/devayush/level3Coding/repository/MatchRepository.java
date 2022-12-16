package com.devayush.level3Coding.repository;

import com.devayush.level3Coding.entity.MatchEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepository extends JpaRepository<MatchEntity , Long> {
}
