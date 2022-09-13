package org.example;

public class CIty {
    private int cityId;
    private String cityName;

    public CIty(int cityId, String cityName) {
        this.cityId = cityId;
        this.cityName = cityName;
    }

    public int getCityId() {
        return cityId;
    }

    public String getCityName() {
        return cityName;
    }
}
