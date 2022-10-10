package com.model;

import java.util.Map;

public class Team_details {
    private int teamId;
    private String teamName,teamOwner;
    private Map<String, Players> players;

    public Team_details(int teamId, String teamName, String teamOwner) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.teamOwner = teamOwner;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamOwner() {
        return teamOwner;
    }

    public void setTeamOwner(String teamOwner) {
        this.teamOwner = teamOwner;
    }

    public Map<String, Players> getPlayers() {
        return players;
    }

    public void setPlayers(Map<String, Players> players) {
        this.players = players;
    }
}
