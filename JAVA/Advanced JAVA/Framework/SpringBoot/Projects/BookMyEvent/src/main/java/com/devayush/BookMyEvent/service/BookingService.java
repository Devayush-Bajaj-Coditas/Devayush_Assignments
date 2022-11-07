package com.devayush.BookMyEvent.service;

import com.devayush.BookMyEvent.entities.BookingEntity;

import java.util.List;

public interface BookingService {
    public BookingEntity createBooking(BookingEntity bookingEntity);

    public List<BookingEntity> getAllBookings(int id);

    public BookingEntity updateBooking (BookingEntity newBookingData);

    public void deleteBooking (int id);


    public BookingEntity bookingStatus(int id, String status);


    public BookingEntity cancelBooking(int id);
}
