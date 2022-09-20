package com.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class StudentBean {
    String name;
    int id;
    @Autowired      //AutoWire using variable
    AddressBean address;
    //@Autowired      //autoWire using Constructor
    public StudentBean(AddressBean address) {
        this.address = address;
    }


    public StudentBean(String name, int id, AddressBean address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    StudentBean(){}

   // @Autowired --> autoWire using setter
    public void setAddress(AddressBean address) {
        this.address = address;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AddressBean getAddress() {
        return address;
    }


    @Override
    public String toString() {
        return "StudentBean{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address=" + address +
                '}';
    }
}
