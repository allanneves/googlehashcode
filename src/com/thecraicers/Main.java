package com.thecraicers;

import com.thecraicers.constants.AppConstant;
import com.thecraicers.controller.StrategyController;
import com.thecraicers.model.Ride;
import com.thecraicers.model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        StrategyController strategyController = new StrategyController();
        AppConstant.extract("src/com/thecraicers/a_example.in");
        List<Ride> rides = AppConstant.getTrips();
        List<Vehicle> vehicles = new ArrayList<>();



        for (int i=0; i < AppConstant.getVehicles(); i++) {
            Vehicle vehicle = new Vehicle();
            vehicles.add(vehicle);
        }

        strategyController.execute(vehicles, rides);

        int aux = 0;
        for (Vehicle vehicle : vehicles) {
            aux = vehicle.getScore() + aux;
        }

        System.out.println("this is the sum: " + aux);

    }
}
