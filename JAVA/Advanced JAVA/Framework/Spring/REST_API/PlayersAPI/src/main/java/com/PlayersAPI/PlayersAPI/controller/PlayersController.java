package com.PlayersAPI.PlayersAPI.controller;


import com.PlayersAPI.PlayersAPI.dao.PlayersDao;
import com.PlayersAPI.PlayersAPI.model.Player;
import com.PlayersAPI.PlayersAPI.model.PlayerList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayersController {
    @Autowired
private PlayersDao playersDao;

@GetMapping("/names")
public List<PlayerList> getNames(){
    return playersDao.getPlayerNames();
}

@GetMapping("/names/{playerId}")
    public Player getPlayerDetails(@PathVariable int playerId){
    return playersDao.getPlayersDetails(playerId);
}
}
