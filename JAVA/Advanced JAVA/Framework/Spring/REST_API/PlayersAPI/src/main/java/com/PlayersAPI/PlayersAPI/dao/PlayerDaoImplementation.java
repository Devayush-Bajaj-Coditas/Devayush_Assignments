package com.PlayersAPI.PlayersAPI.dao;

import com.PlayersAPI.PlayersAPI.model.Player;
import com.PlayersAPI.PlayersAPI.model.PlayerList;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerDaoImplementation implements PlayersDao{

    public List<PlayerList> getPlayerNames() {
        List<PlayerList> playerNames = new ArrayList<>();
        try{
            final String QUERY = "select name, id from players";
            PreparedStatement preparedStatement =GetConnection.connection().prepareStatement(QUERY);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                PlayerList playerList = new PlayerList();
                playerList.setName(resultSet.getString(1));
                playerList.setPlayerId(resultSet.getInt(2));
                playerNames.add(playerList);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return playerNames;
    }

    @Override
    public Player getPlayersDetails(int id) {
        Player player = new Player();
        try {
            PreparedStatement preparedStatement = GetConnection.connection.prepareStatement("select * from players where id = " + id);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                player.setPlayerId(resultSet.getInt(1));
                player.setName(resultSet.getString(2));
                player.setBirthPlace(resultSet.getString(3));
                player.setAge(resultSet.getInt(4));
                player.setOccupation(resultSet.getString(5));
                player.setJerseyNumber(resultSet.getInt(6));
                player.setHeight(resultSet.getFloat(7));
                player.setDescription(resultSet.getString(8));
                player.setProfilePicture(resultSet.getString(9));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return player;
    }
}
