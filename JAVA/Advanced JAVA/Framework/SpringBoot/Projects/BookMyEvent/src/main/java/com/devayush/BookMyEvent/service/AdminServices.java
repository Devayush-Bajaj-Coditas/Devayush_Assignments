package com.devayush.BookMyEvent.service;

import com.devayush.BookMyEvent.entities.EventCategoryEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AdminServices {
    public EventCategoryEntity addEventCategory(EventCategoryEntity eventCategoryEntity);

    public EventCategoryEntity updateEventCategory(EventCategoryEntity eventCategoryEntityNew);

    public void deleteEventCategory(int id);

    public List<EventCategoryEntity> getALlEventCategories();

}
