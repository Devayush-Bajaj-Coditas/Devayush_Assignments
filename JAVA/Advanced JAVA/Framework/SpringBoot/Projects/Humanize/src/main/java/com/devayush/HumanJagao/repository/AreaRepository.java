package com.devayush.HumanJagao.repository;

import com.devayush.HumanJagao.entity.AreaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaRepository extends JpaRepository<Long, AreaEntity> {
}
