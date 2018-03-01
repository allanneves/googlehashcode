package com.thecraicers.util;

import com.thecraicers.model.Ride;

public class ScoreUtil {

    public static Integer getScore(Ride ride, boolean isExactlyOnTIme){
        Integer distance = ride.getDistance();

        if(isExactlyOnTIme) {
            return distance + 100;
        }

        return distance;
    }
}
