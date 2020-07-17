package com.challenge.connected.cities.model;

public class CityName {

    private String fromCityName;

    private String toCityName;

    public CityName(String fromCityName, String toCityName) {
        this.fromCityName = fromCityName;
        this.toCityName = toCityName;
    }

    protected CityName() {
    }

    public String getFromCityName() {
        return fromCityName;
    }

    public void setFromCityName(String fromCityName) {
        this.fromCityName = fromCityName;
    }

    public String getToCityName() {
        return toCityName;
    }

    public void setToCityName(String toCityName) {
        this.toCityName = toCityName;
    }
}
