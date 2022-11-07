package com.devayush.BookMyEvent.service;
import com.devayush.BookMyEvent.entities.EventEntity;
import com.devayush.BookMyEvent.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class EventServicesImplementation implements EventService{
    @Autowired
    EventRepository eventRepository;
    @Override
    public EventEntity createEvent(EventEntity eventEntity) {
        return eventRepository.save(eventEntity);
    }

    @Override
    public List<EventEntity> getAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public EventEntity updateEvent(EventEntity eventEntity) {
        EventEntity eventEntityOld = eventRepository.findById(eventEntity.getEventId()).orElse(null);
        eventEntityOld.setEventCategoryEntity(eventEntity.getEventCategoryEntity());
        eventEntityOld.setEventTitle(eventEntity.getEventTitle());
        eventEntityOld.setEventVanue(eventEntity.getEventVanue());
        eventEntityOld.setEventCapacity(eventEntity.getEventCapacity());
        eventEntityOld.setEventBasePrice(eventEntity.getEventBasePrice());
        eventEntityOld.setEventPricePerPerson(eventEntity.getEventPricePerPerson());
        eventEntityOld.setAverageEventRatings(eventEntity.getAverageEventRatings());
        eventEntityOld.setEventOrganizer(eventEntity.getEventOrganizer());
        return eventEntityOld;
    }

    @Override
    public void deleteEvent(int eventId) {
        eventRepository.deleteById(eventId);
    }

    public EventEntity getEventById(int id){
        return eventRepository.findById(id).orElse(null);
    }

    public List<EventEntity> filterByPrice(float price){
        List<EventEntity>filteredEvents = eventRepository.findByEventBasePriceOrderByEventBasePriceAsc(price);
        return filteredEvents;
    }

    public  List<EventEntity> filterByRating( float rating){
        List<EventEntity> filteredEvents = eventRepository.findByAverageEventRatingsOrderByAverageEventRatingsAsc(rating);
        return filteredEvents;
    }
}
