package com.thecraicers.constants;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.thecraicers.model.Coordinate;
import com.thecraicers.model.Ride;
import com.thecraicers.util.CoordinateUtil;

public class AppConstant {

  public static int rows;
  public static int columns;
  public static int vehicles;
  public static int rides;
  public static int perRideBonus;
  public static int time;

  static ArrayList<Ride> trips = new ArrayList<>();

  public static void extract(String input) {

    File file = new File("src/com/thecraicers/a_example.in");
    System.out.println(file.getAbsolutePath());

    try (FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);) {

      // parse first line of the file
      String line = bufferedReader.readLine();
      String[] myData = line.split(" ");
      rows = Integer.parseInt(myData[0]);
      columns = Integer.parseInt(myData[1]);
      vehicles = Integer.parseInt(myData[2]);
      rides = Integer.parseInt(myData[3]);
      perRideBonus = Integer.parseInt(myData[4]);
      time = Integer.parseInt(myData[5]);

      System.out.println(line);
      line = bufferedReader.readLine();
      while (line != null) {

        myData = line.split(" ");

        Ride ride = new Ride();

        Coordinate cordsStart = new Coordinate();
        int startRow = Integer.parseInt(myData[0]);
        int startCol = Integer.parseInt(myData[1]);
        cordsStart.setX(startRow);
        cordsStart.setY(startCol);
        ride.setStartCoordinate(cordsStart);

        Coordinate cordsEnd = new Coordinate();
        int endRow = Integer.parseInt(myData[2]);
        int endCol = Integer.parseInt(myData[3]);
        cordsEnd.setX(endRow);
        cordsEnd.setY(endCol);
        ride.setFinishCoordinate(cordsEnd);

        ride.setDistance(CoordinateUtil.calculateDistance(cordsStart, cordsEnd));

        int startTime = Integer.parseInt(myData[4]);
        int endTime = Integer.parseInt(myData[5]);
        ride.setEarliestStart(startTime);
        ride.setLatestFinish(endTime);
        trips.add(ride);
        line = bufferedReader.readLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static int getRows() {
    return rows;
  }

  public static int getColumns() {
    return columns;
  }

  public static int getVehicles() {
    return vehicles;
  }

  public static int getRides() {
    return rides;
  }

  public static int getPerRideBonus() {
    return perRideBonus;
  }

  public static int getTime() {
    return time;
  }

  public static ArrayList<Ride> getTrips() {
    return trips;
  }
}
