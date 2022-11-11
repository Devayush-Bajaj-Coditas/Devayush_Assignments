package com.devayush.BookMyEvent.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Event_organizers")
@Data
public class EventOrganizerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int organizerId;
    private String organizerName;
    private String organizerPassword;
    private String organizerEmail;

    @OneToMany(mappedBy = "eventOrganizer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EventEntity> events = new ArrayList<>();

}

