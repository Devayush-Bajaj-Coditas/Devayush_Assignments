package com.bean;

public class Student {
    private int sid;
    private String name;
    private Address address;




    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }



    public Student() {
    }
    public Student( Address address) {
        this.address = address;
    }
    public Student(int sid, String name, Address address) {
        this.sid = sid;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
