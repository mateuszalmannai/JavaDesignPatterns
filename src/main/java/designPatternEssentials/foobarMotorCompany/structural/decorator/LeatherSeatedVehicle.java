package main.designPatternEssentials.foobarMotorCompany.structural.decorator;

public class LeatherSeatedVehicle extends AbstractVehicleOption {

  public LeatherSeatedVehicle(Vehicle vehicle) {
    super(vehicle);
  }

  @Override
  public int getPrice() {
    return decoratedVehicle.getPrice() + 1200;
  }
}
