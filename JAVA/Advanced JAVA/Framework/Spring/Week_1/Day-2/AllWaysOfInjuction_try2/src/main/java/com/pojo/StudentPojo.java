package com.pojo;

public class StudentPojo {

    private String name,branch;
    private long mobile_no;
    private  AddressPojo address;

    public StudentPojo(String name, String branch, long mobile_no, AddressPojo address) {
        this.name = name;
        this.branch = branch;
        this.mobile_no = mobile_no;
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentPojo{" +
                "name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", mobile_no=" + mobile_no +
                '}';
    }
}
