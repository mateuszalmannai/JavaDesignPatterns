package designPatternEssentials.foobarMotorCompany.creational.abstractFactory;

public class VanFactory extends AbstractVehicleFactory {
  @Override
  public Body createBody() {
    return new VanBody();
  }

  @Override
  public Chassis createChassis() {
    return new VanChassis();
  }

  @Override
  public Windows createWindows() {
    return new VanWindows();
  }

  @Override
  public Lights createLights() {
    return new VanLights();
  }
}
