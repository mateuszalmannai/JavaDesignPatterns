package main.designPatternEssentials.foobarMotorCompany.creational.abstractFactory;

public class CarChassis implements Chassis {
  @Override
  public String getChassisParts() {
    return "Chassis parts for a car";
  }
}
