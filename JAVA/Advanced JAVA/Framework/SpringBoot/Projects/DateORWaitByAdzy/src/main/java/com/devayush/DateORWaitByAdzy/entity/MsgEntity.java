package com.devayush.DateORWaitByAdzy.entity;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
public class MsgEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int msgId;
    String msg;


    @ManyToOne
    UserEntity user;
}
