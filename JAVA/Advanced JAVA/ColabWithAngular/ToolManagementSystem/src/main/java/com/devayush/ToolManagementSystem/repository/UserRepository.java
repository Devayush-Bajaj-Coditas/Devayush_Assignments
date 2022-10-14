package com.devayush.ToolManagementSystem.repository;

import com.devayush.ToolManagementSystem.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <UserEntity,Integer> {
    UserEntity findByName(String username);

//    UserEntity findByWorkername(String username);
}
