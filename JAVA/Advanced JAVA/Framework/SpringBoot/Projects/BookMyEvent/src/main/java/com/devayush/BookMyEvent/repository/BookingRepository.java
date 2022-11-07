package com.devayush.BookMyEvent.repository;

import com.devayush.BookMyEvent.entities.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Time;
import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<BookingEntity,Integer> {
    List<BookingEntity> findByStartTimeOrderByBookingIdAsc(Time startTime);

    @Query("select b from BookingEntity b order by b.startTime")
    List<BookingEntity> SortByStartTime();

    @Query("select b from BookingEntity b where b.bookingId > ?1 order by b.startTime")
    List<BookingEntity> filterByStartTime(int bookingId);







}
