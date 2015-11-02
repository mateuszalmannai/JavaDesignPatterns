package designPatternEssentials.foobarMotorCompany.structural.decorator;

import designPatternEssentials.foobarMotorCompany.common.StandardEngine;

public class DecoratorClient {
  public static void main(String[] args) {

    // Create a blue saloon car
    Vehicle myCar = new Saloon(new StandardEngine(1300));
    myCar.paint(Vehicle.Colour.BLUE);
    System.out.println(myCar);

    // Add air-conditioning to the car...
    final AirConditionedVehicle airConditionedVehicle = new AirConditionedVehicle(myCar);

    System.out.println(airConditionedVehicle);
    airConditionedVehicle.setTemperature(20);


    // Now add alloy wheels...
    final AlloyWheeledVehicle alloyWheeledVehicle = new AlloyWheeledVehicle(airConditionedVehicle);
    System.out.println(alloyWheeledVehicle);

    // Now add leather seats...
    final LeatherSeatedVehicle leatherSeatedVehicle = new LeatherSeatedVehicle(alloyWheeledVehicle);
    System.out.println(leatherSeatedVehicle);

    // Now add metallic paint...
    final MetallicPaintedVehicle metallicPaintedVehicle = new MetallicPaintedVehicle(leatherSeatedVehicle);
    System.out.println(metallicPaintedVehicle);

    // Now add satellite-navigation
    final SatNavVehicle satNavVehicle = new SatNavVehicle(metallicPaintedVehicle);
    System.out.println(satNavVehicle);
    satNavVehicle.setDestination("Idaho");
  }
}
