package main.structural.adpater.balazsholczer;

import java.util.Arrays;
import java.util.List;

public class AdapterClient {
  public static void main(String[] args) {
    List<Vehicle> vehicles = Arrays.asList(new Bus(), new Car(), new BicycleAdapter(new Bicycle()));

    vehicles.forEach(Vehicle::accelerate);

  }

}
