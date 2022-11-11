package com.devayush.DateORWaitByAdzy.entity;

import javax.persistence.*;

@Entity
public class SwipeEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    int swipeId;


    UserEntity  userIdOfSwipee;
    UserEntity userIdOfSwiper;
    String response;

    @ManyToOne()
    UserEntity user;



}
