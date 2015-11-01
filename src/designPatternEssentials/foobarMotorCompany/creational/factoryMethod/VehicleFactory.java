package designPatternEssentials.foobarMotorCompany.creational.factoryMethod;

import designPatternEssentials.foobarMotorCompany.common.Vehicle;

public abstract class VehicleFactory {
  public enum DrivingStyle {ECONOMICAL, MIDRANGE, POWERFUL};

  public enum Category {CAR, VAN};

  public Vehicle build(DrivingStyle style, Vehicle.Colour colour) {
    final Vehicle vehicle = selectVehicle(style);
    vehicle.paint(colour);
    return vehicle;
  }

  // This is the "factory method"
  protected abstract Vehicle selectVehicle(DrivingStyle style);

  /**
   * A common useful variation is to define a static factory method that can work
   * out which subclass to instantiate.
   */
  public static Vehicle make(Category category, DrivingStyle style, Vehicle.Colour colour) {
    VehicleFactory factory;
    if (category == Category.CAR) {
      factory = new CarFactory();
    } else {
      factory = new VanFactory();
    }
    return factory.build(style, colour);
  }

}
