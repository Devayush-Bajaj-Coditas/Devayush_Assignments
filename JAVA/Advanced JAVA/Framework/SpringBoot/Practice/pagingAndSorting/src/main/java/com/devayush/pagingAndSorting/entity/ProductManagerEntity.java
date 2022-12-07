package com.devayush.pagingAndSorting.entity;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;

public class ProductManagerEntity {
    UserEntity user;

    @ManyToOne(cascade = CascadeType.ALL)
    Product product;
}
