package designPatternEssentials.foobarMotorCompany.structural.decorator;

public class MetallicPaintedVehicle extends AbstractVehicleOption {

  public MetallicPaintedVehicle(Vehicle vehicle) {
    super(vehicle);
  }

  @Override
  public int getPrice() {
    return decoratedVehicle.getPrice() + 750;
  }
}
