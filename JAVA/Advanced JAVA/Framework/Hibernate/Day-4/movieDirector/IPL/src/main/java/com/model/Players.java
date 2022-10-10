package com.model;

public class Players {
    private int playerId;
    private String name;
    private int bid_value;

    public Players(int playerId, String name, int bid_value) {
        this.playerId = playerId;
        this.name = name;
        this.bid_value = bid_value;
    }

    public int getPlayerId() {
        return playerId;
    }

    public String getName() {
        return name;
    }

    public int getBid_value() {
        return bid_value;
    }
}
