package com.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class AddressBean {
    String area, city;

    public AddressBean(String area, String city) {
        this.area = area;
        this.city = city;
    }

    public AddressBean(){}

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "AddressBean{" +
                "area='" + area + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
