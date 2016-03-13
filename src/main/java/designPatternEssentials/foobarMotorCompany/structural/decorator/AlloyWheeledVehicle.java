package main.designPatternEssentials.foobarMotorCompany.structural.decorator;

public class AlloyWheeledVehicle extends AbstractVehicleOption{

  public AlloyWheeledVehicle(Vehicle vehicle) {
    super(vehicle);
  }

  @Override
  public int getPrice() {
    return decoratedVehicle.getPrice() + 250;
  }
}
