package com.devayush.BookMyEvent.repository;
import com.devayush.BookMyEvent.entities.EventOrganizerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface OrganizerRepository extends JpaRepository<EventOrganizerEntity,Integer> {
    Optional<EventOrganizerEntity> findByOrganizerEmail(String organizerEmail);
}
