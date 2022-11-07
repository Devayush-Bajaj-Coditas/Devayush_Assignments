package com.devayush.BookMyEvent.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Events")
public class  EventEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eventId;
    private String eventTitle;
    private String eventVanue;
    private int eventCapacity;
    private float eventBasePrice;
    private float eventPricePerPerson;
    private float averageEventRatings;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "organizer_Id")
    private EventOrganizerEntity eventOrganizer;

    //one to many feedback
    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FeedbackEntity> feedbacks = new ArrayList<>();

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "event_category_id")
    private EventCategoryEntity eventCategoryEntity;

    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BookingEntity> bookingEntities = new ArrayList<>();


}
