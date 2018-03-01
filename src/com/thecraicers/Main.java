package com.thecraicers;

import com.thecraicers.controller.StrategyController;
import com.thecraicers.model.Ride;
import com.thecraicers.model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        List<Ride> rides = new ArrayList<>();
        StrategyController strategyController = new StrategyController();
        strategyController.execute(vehicles, rides);

    }
}
