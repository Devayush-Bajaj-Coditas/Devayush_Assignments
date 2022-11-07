package com.devayush.BookMyEvent.repository;

import com.devayush.BookMyEvent.entities.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<AdminEntity,Integer> {
    Optional<AdminEntity> findByAdminEmail(String adminEmail);

}
