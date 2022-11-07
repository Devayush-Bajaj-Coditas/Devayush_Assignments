package com.devayush.BookMyEvent.service;

import com.devayush.BookMyEvent.entities.EventEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface EventService {
    //crud of event

    public EventEntity createEvent(EventEntity eventEntity);

    public List<EventEntity> getAllEvents();

    public EventEntity updateEvent (EventEntity eventEntity);

    public void deleteEvent (int eventId);

    public EventEntity getEventById(int id);

    public List<EventEntity> filterByPrice(float price);

    public  List<EventEntity> filterByRating( float rating);
}
