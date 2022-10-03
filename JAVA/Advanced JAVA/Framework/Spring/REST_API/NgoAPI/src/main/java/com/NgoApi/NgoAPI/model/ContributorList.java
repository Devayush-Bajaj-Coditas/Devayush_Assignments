package com.NgoApi.NgoAPI.model;

public class ContributorList {
    private int contributorId;
    private String name;

    private String profilePicture;

    @Override
    public String toString() {
        return "ContributorList{" +
                "contributorId=" + contributorId +
                ", name='" + name + '\'' +
                ", profilePicture='" + profilePicture + '\'' +
                '}';
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public int getContributorId() {
        return contributorId;
    }

    public void setContributorId(int contributorId) {
        this.contributorId = contributorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
