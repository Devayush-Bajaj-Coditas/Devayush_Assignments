package com.devayush.BookMyEvent.repository;

import com.devayush.BookMyEvent.entities.FeedbackEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackRepository extends JpaRepository<FeedbackEntity,Integer>{
}
