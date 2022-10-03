package com.PlayersAPI.PlayersAPI.dao;

import com.PlayersAPI.PlayersAPI.model.Player;
import com.PlayersAPI.PlayersAPI.model.PlayerList;

import java.util.List;

public interface PlayersDao {
public List<PlayerList> getPlayerNames();

public Player getPlayersDetails(int id);
}
