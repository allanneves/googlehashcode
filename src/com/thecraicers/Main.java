package com.thecraicers;

import com.thecraicers.constants.AppConstant;
import com.thecraicers.controller.VehicleController;
import com.thecraicers.model.Ride;

import java.util.List;

public class Main {


    private VehicleController vehicleController;
    private List<Ride> rides;

    public static void main(String[] args) {
      AppConstant x = new AppConstant();
      x.extract("src/com/thecraicers/a_example.in");
      
    }
}
