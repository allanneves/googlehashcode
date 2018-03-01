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
                Integer maximumRating = 0;
                Integer roundedScore = 0;
                Ride selectedRide = null;
                Integer rideId = null;
                Integer vehicleCurrentStep = null;
                for (int i=0; i < rides.size(); i++) {
                    if (rides.get(i).isAvailable()) {
                        Integer distanceLeft = CoordinateUtil.calculateDistance(vehicle.getCurrentLocation(), rides.get(i).getStartCoordinate());
                        int startingStepCandidate = vehicle.getCurrentStep() + distanceLeft;
                        if ((startingStepCandidate < rides.get(i).getLatestFinish() && (startingStepCandidate + rides.get(i).getDistance() <= rides.get(i).getLatestFinish()))) {
                            int timeToCompleteTheRide = Math.max(distanceLeft, rides.get(i).getEarliestStart() - vehicle.getCurrentStep()) + rides.get(i).getDistance();
                            boolean isOnTime = distanceLeft <= (rides.get(i).getEarliestStart() - vehicle.getCurrentStep());
                            Integer scoreCandidate = ScoreUtil.getScore(rides.get(i), isOnTime);
                            int rating = scoreCandidate / timeToCompleteTheRide;
                            if (rating > maximumRating) {
                                maximumRating = rating;
                                rideId = i;
                                roundedScore = scoreCandidate;
                                selectedRide = rides.get(i);
                                vehicleCurrentStep = vehicle.getCurrentStep() + timeToCompleteTheRide;
                            }
                        }
                    }
                }

                if (rideId != null) {
                    vehicle.getCompletedRides().add(rideId);
                    vehicle.setScore(vehicle.getScore() + roundedScore);
                    vehicle.setCurrentLocation(selectedRide.getFinishCoordinate());
                    selectedRide.setAvailable(false);
                    vehicle.setCurrentStep(vehicleCurrentStep);
                } else {
                    break;
                }
            }
        }
    }
}
