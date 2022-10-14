package com.devayush.ToolManagementSystem.repository;

import com.devayush.ToolManagementSystem.entity.WorkerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository extends JpaRepository<WorkerEntity, Integer> {
}
