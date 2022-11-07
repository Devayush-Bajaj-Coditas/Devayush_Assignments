package com.devayush.BookMyEvent.service;

import com.devayush.BookMyEvent.entities.EventCategoryEntity;
import com.devayush.BookMyEvent.repository.EventCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServicesImplementation implements AdminServices{
    @Autowired
    EventCategoryRepository eventCategoryRepository;
    @Override
    public EventCategoryEntity addEventCategory(EventCategoryEntity eventCategoryEntity) {
        return eventCategoryRepository.save(eventCategoryEntity);

    }

    @Override
    public EventCategoryEntity updateEventCategory(EventCategoryEntity eventCategoryEntityNew) {
        EventCategoryEntity eventCategoryEntityOld = eventCategoryRepository.findById(eventCategoryEntityNew.getCategoryId()).orElse(null);
        eventCategoryEntityOld.setCategory(eventCategoryEntityNew.getCategory());
        return eventCategoryRepository.save(eventCategoryEntityOld);
    }

    @Override
    public void deleteEventCategory(int id) {
        eventCategoryRepository.deleteById(id);
    }

    @Override
    public List<EventCategoryEntity> getALlEventCategories() {
        return eventCategoryRepository.findAll();
    }
}
