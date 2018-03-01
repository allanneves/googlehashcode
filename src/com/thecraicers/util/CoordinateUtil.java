package com.thecraicers.util;

import com.thecraicers.model.Coordinate;

public class CoordinateUtil {

    public static Integer calculateDistance(Coordinate coordinate1, Coordinate coordinate2){
        Integer coordinate1X = coordinate1.getX();
        Integer coordinate1Y = coordinate1.getY();
        Integer coordinate2X = coordinate2.getX();
        Integer coordinate2Y = coordinate2.getY();

        int firstCoordinate = Math.abs(coordinate1X - coordinate2X);
        int secondCoordinate = Math.abs(coordinate1Y - coordinate2Y);

        int distance = firstCoordinate + secondCoordinate;

        return distance;
    }
}
