package com.devayush.BookMyEvent.repository;

import com.devayush.BookMyEvent.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {
    CustomerEntity findByEmail(String email);

}
