package designPatternEssentials.foobarMotorCompany.creational.abstractFactory;

public abstract class AbstractVehicleFactory {
  public abstract Body createBody();

  public abstract Chassis createChassis();

  public abstract Windows createWindows();

  public abstract Lights createLights();

}
