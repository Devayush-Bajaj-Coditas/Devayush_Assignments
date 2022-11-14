package com.devayush.level3Coding.controller;

import com.devayush.level3Coding.entity.MatchEntity;
import com.devayush.level3Coding.model.dto.request.RegisterPlayerDto;
import com.devayush.level3Coding.service.MatchService;
import com.devayush.level3Coding.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @Autowired
    MatchService matchService;


    @PostMapping("/register")
    public ResponseEntity registerPlayer(@RequestBody RegisterPlayerDto registerPlayerDto) {
        try {
            return new ResponseEntity(Optional.of(playerService.registerPlayer(registerPlayerDto)), HttpStatus.CREATED);
        }catch (Exception exception){
            return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
        }
    }


}
