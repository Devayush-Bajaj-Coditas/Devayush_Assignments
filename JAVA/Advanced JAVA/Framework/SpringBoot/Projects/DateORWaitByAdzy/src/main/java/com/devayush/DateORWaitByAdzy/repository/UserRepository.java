package com.devayush.DateORWaitByAdzy.repository;

import com.devayush.DateORWaitByAdzy.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    @Query("select u from UserEntity u order by u.userLastName")
    List<UserEntity> SortByLastName();

    @Query("select u from UserEntity u where u.userId > ?1 order by u.userLastName")
    List<UserEntity> findByLastNameIdmoreThen(long userId);

    @Query("select count(u) from UserEntity u where u.swipesDone = ?1")
    long countBySwipes(int swipesDone);





}
