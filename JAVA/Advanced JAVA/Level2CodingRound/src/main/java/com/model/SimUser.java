package com.model;

import javax.persistence.*;

@Entity
@Table(name = "Users_Data")
public class SimUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "User_Id")
    int userId;
    @Column(name = "User_Name")
    String name;
    @Column(name = "User_Email")
    String email;
    @Column(name = "Address")
    String address;
    @Column(name = "Aadhar_Number")
    long aadharNumber;
    @Column(name = "Sim_Type")
    String simType;
    @Column(name = "Balance")
    float balance;
    @Column(name = "Balance_Validity")
    float validityDays;
    @Column(name = "Mobile_Number")
    long mobileNumber;

    public SimUser(int userId, String name, String email, String address, long aadharNumber, String simType, float balance, float validityDays, long mobileNumber) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.address = address;
        this.aadharNumber = aadharNumber;
        this.simType = simType;
        this.balance = balance;
        this.validityDays = validityDays;
        this.mobileNumber = mobileNumber;
    }

    public SimUser() {
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public long getAadharNumber() {
        return aadharNumber;
    }

    public String getSimType() {
        return simType;
    }

    public float getBalance() {
        return balance;
    }

    public float getValidityDays() {
        return validityDays;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }
}
