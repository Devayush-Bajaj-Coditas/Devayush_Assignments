package com.devayush.DateORWaitByAdzy.entity;

import javax.persistence.*;

@Entity
public class MsgEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int msgId;
    String msg;


    @ManyToOne
    UserEntity userEntity;
}
