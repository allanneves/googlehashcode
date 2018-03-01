package com.thecraicers.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.thecraicers.model.Vehicle;

public class ExportResult {

  public static void export(List<Vehicle> results) throws IOException {
    
    String FILENAME = "filename.txt";

    BufferedWriter bw = null;
    FileWriter fw = null;

    File file = new File(FILENAME);
    StringBuilder data = null;
    for (Vehicle singleResult : results) {

      for (int x : singleResult.getCompletedRides()) {
        data.append(x + " ");
      }

      fw = new FileWriter(file.getAbsoluteFile(), true);
      bw = new BufferedWriter(fw);
      bw.write(data + "\n");
      bw.close();
    }
  }
}
