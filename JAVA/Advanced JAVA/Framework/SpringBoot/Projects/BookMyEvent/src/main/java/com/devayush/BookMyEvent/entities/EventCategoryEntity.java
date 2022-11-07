package com.devayush.BookMyEvent.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "event_categories")
public class EventCategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;
    private String category;

    @OneToMany(mappedBy = "eventCategoryEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EventEntity> events = new ArrayList<>();


}
