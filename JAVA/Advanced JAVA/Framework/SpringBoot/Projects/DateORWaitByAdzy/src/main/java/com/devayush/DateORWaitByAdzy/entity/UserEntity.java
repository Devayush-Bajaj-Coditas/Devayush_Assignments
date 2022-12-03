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

    @OneToMany(mappedBy = "swiper")
    List<SwipeEntity> swipeEntityList;

    @OneToMany(mappedBy = "user")
    List<MsgEntity> msgs;
}
