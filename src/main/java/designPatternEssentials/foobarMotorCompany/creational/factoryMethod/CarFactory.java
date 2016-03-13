package main.designPatternEssentials.foobarMotorCompany.creational.factoryMethod;

import main.designPatternEssentials.foobarMotorCompany.common.*;

public class CarFactory extends VehicleFactory {
  @Override
  protected Vehicle selectVehicle(DrivingStyle style) {
    Vehicle vehicle;
    if (style == DrivingStyle.ECONOMICAL) {
      vehicle = new Saloon(new StandardEngine(1300));
    } else if (style == DrivingStyle.MIDRANGE) {
      vehicle = new Coupe(new StandardEngine(1600));
    } else {
      vehicle = new Sport(new TurboEngine(2000));
    }
    return vehicle;
  }
}
