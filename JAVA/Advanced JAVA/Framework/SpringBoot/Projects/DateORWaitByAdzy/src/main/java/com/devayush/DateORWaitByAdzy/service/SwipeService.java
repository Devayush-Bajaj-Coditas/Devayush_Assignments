package com.devayush.DateORWaitByAdzy.service;

import com.devayush.DateORWaitByAdzy.entity.SwipeEntity;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.http.ResponseEntity;

public interface SwipeService {

    public ResponseEntity swipeRight(long id);


    public ResponseEntity responseSwipe(long swiperId, Boolean response);

    public ResponseEntity getAllrequests(long id);




}
