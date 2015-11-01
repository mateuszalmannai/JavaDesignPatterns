package designPatternEssentials.foobarMotorCompany.creational.factoryMethod;

import designPatternEssentials.foobarMotorCompany.common.*;

public class VanFactory extends VehicleFactory {
  @Override
  protected Vehicle selectVehicle(DrivingStyle style) {
    Vehicle vehicle;
    if ((style == DrivingStyle.ECONOMICAL) || (style == DrivingStyle.MIDRANGE)) {
      vehicle = new Pickup(new StandardEngine(2200));
    } else {
      vehicle = new BoxVan(new TurboEngine(2500));
    }
    return vehicle;
  }
}
