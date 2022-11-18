package com.devayush.level3Coding.repository;
import com.devayush.level3Coding.entity.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PlayerRepository extends JpaRepository<PlayerEntity, Long> {

}
