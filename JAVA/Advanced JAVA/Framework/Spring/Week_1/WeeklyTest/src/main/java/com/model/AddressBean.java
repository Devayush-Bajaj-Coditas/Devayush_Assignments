package com.model;

public class AddressBean {
    int addressId;
    String flatNo;
    String pincode;
    String city;

    public AddressBean() {
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(String flatNo) {
        this.flatNo = flatNo;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
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
                "addressId=" + addressId +
                ", flatNo='" + flatNo + '\'' +
                ", pincode='" + pincode + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
