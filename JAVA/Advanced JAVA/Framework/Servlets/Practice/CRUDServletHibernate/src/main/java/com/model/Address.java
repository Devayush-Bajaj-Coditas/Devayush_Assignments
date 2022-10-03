package com.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    String area;
    String city;

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

    public Address(String area, String city) {
        this.area = area;
        this.city = city;
    }

    public Address() {
    }
}
