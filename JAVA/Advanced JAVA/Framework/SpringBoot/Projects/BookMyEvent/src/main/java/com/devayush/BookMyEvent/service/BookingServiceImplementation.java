package com.devayush.BookMyEvent.service;

import com.devayush.BookMyEvent.entities.BookingEntity;
import com.devayush.BookMyEvent.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookingServiceImplementation implements BookingService {
    @Autowired
    BookingRepository bookingRepository;



    @Override
    public BookingEntity createBooking(BookingEntity bookingEntity) {
        return bookingRepository.save(bookingEntity);
    }

    @Override
    public List<BookingEntity> getAllBookings(int id) {
        return bookingRepository.findAll();
    }

    @Override
    public BookingEntity updateBooking(BookingEntity newBookingData) {
        BookingEntity bookingEntityOld = bookingRepository.getById(newBookingData.getBookingId());
        bookingEntityOld.setStartTime(newBookingData.getStartTime());
        bookingEntityOld.setEndTime(newBookingData.getEndTime());
        bookingEntityOld.setDate(newBookingData.getDate());
        bookingEntityOld.setNumberOfGuests(newBookingData.getNumberOfGuests());
        bookingEntityOld.setTotalPrice(newBookingData.getTotalPrice());
        bookingEntityOld.setBookingStatus(newBookingData.getBookingStatus());
        return bookingRepository.save(bookingEntityOld);
    }

    @Override
    public void deleteBooking(int id) {
        bookingRepository.deleteById(id);
    }

    @Override
    public BookingEntity bookingStatus(int id, String status) {
        BookingEntity booking = bookingRepository.findById(id).orElse(null);

        if (status.equalsIgnoreCase("accepted")) {
            booking.setBookingStatus("accepted");
        } else {
            booking.setBookingStatus("declined");
        }

        return bookingRepository.save(booking);
    }

    @Override
    public BookingEntity cancelBooking(int id){
        BookingEntity booking = bookingRepository.findById(id).orElse(null);
        booking.setBookingStatus("cancelled");
        return bookingRepository.save(booking);
    }
}
