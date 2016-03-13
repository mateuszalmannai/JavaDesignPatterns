package main.designPatternEssentials.foobarMotorCompany.creational.abstractFactory;

public class CarFactory extends AbstractVehicleFactory {
  @Override
  public Body createBody() {
    return new CarBody();
  }

  @Override
  public Chassis createChassis() {
    return new CarChassis();
  }

  @Override
  public Windows createWindows() {
    return new CarWindows();
  }

  @Override
  public Lights createLights() {
    return new CarLights();
  }

}
