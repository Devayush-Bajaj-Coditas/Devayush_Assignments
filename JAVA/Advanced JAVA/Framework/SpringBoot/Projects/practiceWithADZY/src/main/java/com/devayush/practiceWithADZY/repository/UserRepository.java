package com.devayush.practiceWithADZY.repository;

import com.devayush.practiceWithADZY.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    @Query("select u from UserEntity u where upper(u.email) like upper(?1)")
    Optional<UserEntity> findByEmailLikeIgnoreCase(String email);



}
