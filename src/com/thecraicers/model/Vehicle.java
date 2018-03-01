package com.thecraicers.model;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {

    private Coordinate currentLocation;
    private Integer currentStep;
    private List<Integer> completedRides = new ArrayList<>();
    private Integer score = 0;

    public Coordinate getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Coordinate currentLocation) {
        this.currentLocation = currentLocation;
    }

    public Integer getCurrentStep() {
        return currentStep;
    }

    public void setCurrentStep(Integer currentStep) {
        this.currentStep = currentStep;
    }

    public List<Integer> getCompletedRides() {
        return completedRides;
    }

    public void setCompletedRides(List<Integer> completedRides) {
        this.completedRides = completedRides;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
