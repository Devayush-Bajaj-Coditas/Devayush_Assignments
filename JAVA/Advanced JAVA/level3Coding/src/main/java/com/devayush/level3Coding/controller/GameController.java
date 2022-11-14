package com.devayush.level3Coding.controller;

import com.devayush.level3Coding.model.dto.request.StartMatchDto;
import com.devayush.level3Coding.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/game")
public class GameController {

    @Autowired
    MatchService matchService;

    @PostMapping("/startMatch")
    public ResponseEntity createNewMatch(@RequestBody StartMatchDto startMatchDto) {

        try {
            return new ResponseEntity(Optional.of(matchService.createNewMatch(startMatchDto)), HttpStatus.CREATED);
        }catch(Exception exception){
            exception.printStackTrace();
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

}
