public class Address {
    String houseNO, area, city;
    int pinCode;
    public Address(String houseNO, String area, String city, int pinCode) {
        this.houseNO = houseNO;
        this.area = area;
        this.city = city;
        this.pinCode = pinCode;
    }
    public String getHouseNO() {
        return houseNO;
    }

    public void setHouseNO(String houseNO) {
        this.houseNO = houseNO;
    }

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

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNO='" + houseNO + '\'' +
                ", area='" + area + '\'' +
                ", city='" + city + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }


}
