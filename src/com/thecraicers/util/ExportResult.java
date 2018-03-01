package com.thecraicers.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.thecraicers.model.Vehicle;

public class ExportResult {

  public static void export(List<Vehicle> results) {

    try {
      String FILENAME = "output.txt";

      BufferedWriter bw = null;
      FileWriter fw = null;

      File file = new File(FILENAME);
      for (Vehicle singleResult : results) {
        StringBuilder data = new StringBuilder();

        data.append(singleResult.getCompletedRides().size() + " ");

        for (Integer integer : singleResult.getCompletedRides()) {
          data.append(integer + " ");
        }



        fw = new FileWriter(file.getAbsoluteFile(), true);
        bw = new BufferedWriter(fw);
        bw.write(data + "\n");
        bw.close();
      }
    } catch (IOException e) {
      System.out.println("It's Chrisophe's fault");
    } catch (NullPointerException e) {
      System.out.println("Ugly Exception");
    }
  }
}
