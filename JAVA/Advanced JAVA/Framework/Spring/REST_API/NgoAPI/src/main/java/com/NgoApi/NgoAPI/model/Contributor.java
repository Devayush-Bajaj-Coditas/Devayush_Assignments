package com.NgoApi.NgoAPI.model;


public class Contributor {
    private int contributorId;
    private String name;
    private String email;
    private Long phoneNumber;
    private String address;
    private String occupation;
    private float contributionAmt;
    private String contributingSince;
    private String profilePicture;


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public float getContributionAmt() {
        return contributionAmt;
    }

    public void setContributionAmt(float contributionAmt) {
        this.contributionAmt = contributionAmt;
    }

    public String getContributingSince() {
        return contributingSince;
    }

    public void setContributingSince(String contributingSince) {
        this.contributingSince = contributingSince;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    @Override
    public String toString() {
        return "Contributor{" +
                "contributorId=" + contributorId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                ", occupation='" + occupation + '\'' +
                ", contributionAmt=" + contributionAmt +
                ", contributingSince='" + contributingSince + '\'' +
                ", profilePicture='" + profilePicture + '\'' +
                '}';
    }
}


