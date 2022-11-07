package com.devayush.BookMyEvent.repository;

import com.devayush.BookMyEvent.entities.EventCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventCategoryRepository extends JpaRepository<EventCategoryEntity,Integer> {
}
