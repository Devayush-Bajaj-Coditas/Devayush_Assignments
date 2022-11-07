package com.devayush.BookMyEvent.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
@Data
@Entity
@Table(name = "Bookings")
public class BookingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingId;
    private Time startTime;
    private Time endTime;
    private Date date;
    private int numberOfGuests;
    private float totalPrice;
    private String bookingStatus;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "booked_user_id")
    private CustomerEntity user;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "event_id")
    private EventEntity event;

}
