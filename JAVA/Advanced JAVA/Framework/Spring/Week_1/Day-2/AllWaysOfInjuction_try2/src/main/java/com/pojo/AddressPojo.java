package com.pojo;

public class AddressPojo {

    String area, city;
    int houseNO, pincode;

    public AddressPojo(int houseNO, String area, String city, int pincode) {
        this.area = area;
        this.city = city;
        this.houseNO = houseNO;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "AddressPojo{" +
                "area='" + area + '\'' +
                ", city='" + city + '\'' +
                ", houseNO=" + houseNO +
                ", pincode=" + pincode +
                '}';
    }
}
