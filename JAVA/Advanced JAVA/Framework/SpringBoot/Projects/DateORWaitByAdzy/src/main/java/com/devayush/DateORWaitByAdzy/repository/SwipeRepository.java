package com.devayush.DateORWaitByAdzy.repository;

import com.devayush.DateORWaitByAdzy.entity.SwipeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SwipeRepository extends JpaRepository<SwipeEntity ,Integer> {


    List<SwipeEntity> findBySwipeeId(long swipeeId);





}
