package com.thecraicers.model;

import com.thecraicers.util.CoordinateUtil;

public class Ride {

    private Coordinate startCoordinate;
    private Coordinate finishCoordinate;
    private Integer earliestStart;
    private Integer latestFinish;
    private Integer distance;
    private Score score;
    private float rating;

    public Ride() {
        this.startCoordinate = new Coordinate();
        this.finishCoordinate = new Coordinate();
        this.distance = CoordinateUtil.calculateDistance(this.getStartCoordinate(), this.getFinishCoordinate());
    }

    public Integer getEarliestStart() {
        return earliestStart;
    }

    public void setEarliestStart(Integer earliestStart) {
        this.earliestStart = earliestStart;
    }

    public Integer getLatestFinish() {
        return latestFinish;
    }

    public void setLatestFinish(Integer latestFinish) {
        this.latestFinish = latestFinish;
    }

    public Coordinate getStartCoordinate() {
        return startCoordinate;
    }

    public void setStartCoordinate(Coordinate startCoordinate) {
        this.startCoordinate = startCoordinate;
    }

    public Coordinate getFinishCoordinate() {
        return finishCoordinate;
    }

    public void setFinishCoordinate(Coordinate finishCoordinate) {
        this.finishCoordinate = finishCoordinate;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }
}
