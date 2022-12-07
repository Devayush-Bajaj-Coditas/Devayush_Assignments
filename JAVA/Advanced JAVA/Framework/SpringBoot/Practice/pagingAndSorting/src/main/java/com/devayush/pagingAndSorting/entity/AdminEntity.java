package com.devayush.pagingAndSorting.entity;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class AdminEntity {
    int AdminId;

    //one admin has many product managers
    @OneToMany(mappedBy = "")
    ProductManagerEntity productManager;
}
