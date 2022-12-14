package com.devayush.inventoryservice.repository;

import com.devayush.inventoryservice.entity.InventoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InventoryRepository extends JpaRepository<InventoryEntity, Integer> {


    Optional<InventoryEntity> findBySkuCode();
}
