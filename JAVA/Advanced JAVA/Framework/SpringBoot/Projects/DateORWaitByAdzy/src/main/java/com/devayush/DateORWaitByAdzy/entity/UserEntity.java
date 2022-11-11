package com.devayush.DateORWaitByAdzy.entity;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long userId;
    String userFirstName;
    String userLastName;
    String userPassword;
    long userPhoneNumber;
    String userEmail;
    int swipesDone;

    @OneToMany(mappedBy = "user")
    List<SwipeEntity> swipeEntityList;

    @OneToMany()
    List<MsgEntity> msgs;
}
