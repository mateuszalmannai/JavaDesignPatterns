package main.designPatternEssentials.foobarMotorCompany.structural.decorator;

public class AirConditionedVehicle extends AbstractVehicleOption{

  public AirConditionedVehicle(Vehicle vehicle) {
    super(vehicle);
  }

  @Override
  public int getPrice() {
    return decoratedVehicle.getPrice() + 600;
  }

  public void setTemperature(int value) {
    // code to set the temperature
    System.out.println("Setting temperature to " + value + " degrees.");
  }
}
