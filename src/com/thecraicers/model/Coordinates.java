package com.thecraicers.model;

public class Coordinates {

    private Integer latitude;
    private Integer longitude;

    public Coordinates() {
        latitude = 0;
        longitude = 0;
    }

    public Integer getLatitude() {
        return latitude;
    }

    public void setLatitude(Integer latitude) {
        this.latitude = latitude;
    }

    public Integer getLongitude() {
        return longitude;
    }

    public void setLongitude(Integer longitude) {
        this.longitude = longitude;
    }
}
