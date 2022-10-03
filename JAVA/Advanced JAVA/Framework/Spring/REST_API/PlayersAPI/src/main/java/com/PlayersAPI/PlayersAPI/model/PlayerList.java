package com.PlayersAPI.PlayersAPI.model;

public class PlayerList {
int playerId;
String name;

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "playerList{" +
                "playerId=" + playerId +
                ", name='" + name + '\'' +
                '}';
    }
}
