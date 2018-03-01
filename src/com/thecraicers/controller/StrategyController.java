package com.thecraicers.controller;

import com.thecraicers.constants.AppConstants;
import com.thecraicers.model.Ride;
import com.thecraicers.model.Vehicle;
import com.thecraicers.util.CoordinateUtil;
import com.thecraicers.util.ScoreUtil;

import java.util.List;

public class StrategyController {


    public void execute(List<Vehicle> vehicles, List<Ride> rides) {
        for (Vehicle vehicle : vehicles) {
            while (vehicle.getCurrentStep() < AppConstants.T) {
                rides.forEach(ride -> {
                    Integer distanceLeft = CoordinateUtil.calculateDistance(vehicle.getCurrentLocation(), ride.getStartCoordinate());
                    int startingStepCandidate = vehicle.getCurrentStep() + distanceLeft;
                    if ((startingStepCandidate < ride.getLatestFinish() && (startingStepCandidate + ride.getDistance() <= ride.getLatestFinish()))) {
                        int timeToCompleteTheRide = Math.max(distanceLeft, ride.getEarliestStart() - vehicle.getCurrentStep()) + ride.getDistance();
                        boolean isOnTime = distanceLeft <= (ride.getEarliestStart() - vehicle.getCurrentStep());
                        Integer scoreCandidate = ScoreUtil.getScore(ride, isOnTime);
                        float rating = (scoreCandidate / timeToCompleteTheRide);
                    } else {
                        r
                    }
                        }
                );
            }
        }
    }
}
