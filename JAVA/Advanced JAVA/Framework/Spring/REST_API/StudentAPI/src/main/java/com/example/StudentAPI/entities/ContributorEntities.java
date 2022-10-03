package com.example.StudentAPI.entities;

public class ContributorEntities {

    private int id;
    private String profilePicture;
    private String ContributorName;
    private Long phoneNumber;
    private String email;
        private String address;
    private String occupation;
    private float contributionAmt;

    public ContributorEntities(int id, String profilePicture, String contributorName, Long phoneNumber, String email, String address, String occupation, float contributionAmt) {
        this.id = id;
        this.profilePicture = profilePicture;
        ContributorName = contributorName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.occupation = occupation;
        this.contributionAmt = contributionAmt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getContributorName() {
        return ContributorName;
    }

    public void setContributorName(String contributorName) {
        ContributorName = contributorName;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
}
