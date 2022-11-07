package com.devayush.BookMyEvent.repository;

import com.devayush.BookMyEvent.entities.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EventRepository extends JpaRepository<EventEntity,Integer>{


    List<EventEntity> findByEventBasePriceOrderByEventBasePriceAsc(float eventBasePrice);

    List<EventEntity> findByAverageEventRatingsOrderByAverageEventRatingsAsc(float averageEventRatings);





}
