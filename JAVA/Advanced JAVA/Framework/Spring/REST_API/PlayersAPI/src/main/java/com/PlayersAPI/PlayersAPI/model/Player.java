package com.PlayersAPI.PlayersAPI.model;

public class Player {
    int playerId;

    String name;

    String birthPlace;
    int age;
    String occupation;
    int jerseyNumber;
    float height;
    String description;
    String profilePicture;

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getName() {
        return name;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthPlace() {
        return birthPlace;
    };

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getDescription() {
        return description;
    }



    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", name='" + name + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                ", jerseyNumber=" + jerseyNumber +
                ", height=" + height +
                ", description='" + description + '\'' +
                ", profilePicture='" + profilePicture + '\'' +
                '}';
    }
}
