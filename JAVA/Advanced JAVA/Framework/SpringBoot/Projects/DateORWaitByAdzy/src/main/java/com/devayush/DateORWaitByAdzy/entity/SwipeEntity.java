package com.devayush.DateORWaitByAdzy.entity;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
public class SwipeEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    int swipeId;
    long swipeeId;
    boolean status;
    @ManyToOne()
    UserEntity swiper;



}
