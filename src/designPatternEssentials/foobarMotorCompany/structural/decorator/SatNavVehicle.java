package designPatternEssentials.foobarMotorCompany.structural.decorator;

public class SatNavVehicle extends AbstractVehicleOption{

  public SatNavVehicle(Vehicle vehicle) {
    super(vehicle);
  }

  @Override
  public int getPrice() {
    return decoratedVehicle.getPrice() + 1500;
  }

  public void setDestination(String target) {
    // code to set the destination ...
    System.out.println("Setting the destination to " + target);
  }
}
