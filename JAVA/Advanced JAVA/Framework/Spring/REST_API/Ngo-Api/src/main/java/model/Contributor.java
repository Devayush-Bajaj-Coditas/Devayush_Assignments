package model;


import javax.persistence.*;

@Entity
@Table(name = "contributors")
public class Contributor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int contributorId;
    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;
    @Column(name = "phone_number")
    private Long phoneNumber;
    @Column(name = "address")
    private String address;
    @Column(name = "occupation")
    private String occupation;
    @Column(name = "contribution_amt")
    private float contributionAmt;
    @Column(name = "contributing_since")
        private String contributingSince;
    @Column(name = "profile_picture")
    private String profilePicture;


    public Contributor() {
    }

    public Contributor(int contributorId, String name, String email, Long phoneNumber, String address, String occupation, float contributionAmt, String contributingSince, String profilePicture) {
        this.contributorId = contributorId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.occupation = occupation;
        this.contributionAmt = contributionAmt;
        this.contributingSince = contributingSince;
        this.profilePicture = profilePicture;
    }

    public String getContributingSince() {
        return contributingSince;
    }

    public void setContributingSince(String contributingSince) {
        this.contributingSince = contributingSince;
    }

    public int getContributorId() {
        return contributorId;
    }

    public void setContributorId(int contributorId) {
        this.contributorId = contributorId;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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


    @Override
    public String toString() {
        return "Contributor{" +
                "contributorId=" + contributorId +
                ", profilePicture='" + profilePicture + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", occupation='" + occupation + '\'' +
                ", contributingSince='" + contributingSince + '\'' +
                ", contributionAmt=" + contributionAmt +
                '}';
    }
}
