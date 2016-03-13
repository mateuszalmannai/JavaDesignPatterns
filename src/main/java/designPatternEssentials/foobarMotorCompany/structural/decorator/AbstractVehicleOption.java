package main.designPatternEssentials.foobarMotorCompany.structural.decorator;

/**
 * AbstractVehicleOption is the abstract "decorator" class and it
 * requires a reference to the Vehicle class which is to be decorated.
 */
public abstract class AbstractVehicleOption extends AbstractVehicle {

  protected Vehicle decoratedVehicle;

  public AbstractVehicleOption(Vehicle vehicle) {
    super(vehicle.getEngine());
    decoratedVehicle = vehicle;
  }
}
