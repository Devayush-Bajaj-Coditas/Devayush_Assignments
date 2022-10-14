package com.devayush.ToolManagementSystem.repository;

import com.devayush.ToolManagementSystem.entity.ToolEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToolRepository extends JpaRepository<ToolEntity,Integer> {
}
