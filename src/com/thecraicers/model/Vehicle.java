package com.thecraicers.model;

import java.util.List;

public class Vehicle {

    private List<Coordinate> coordinates;

    public List getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Coordinate> coordinate) {
        this.coordinates = coordinate;
    }
}
