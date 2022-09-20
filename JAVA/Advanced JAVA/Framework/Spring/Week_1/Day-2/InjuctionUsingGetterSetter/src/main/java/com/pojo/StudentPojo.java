package com.pojo;

public class StudentPojo {
    private String name, branch, enrollmentId;
    private int mobile;
    private AddressPojo address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(String enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public AddressPojo getAddress() {
        return address;
    }

    public void setAddress(AddressPojo address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentPojo{" +
                "name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", enrollmentId='" + enrollmentId + '\'' +
                ", mobile=" + mobile +
                ", address=" + address +
                '}';
    }
}
