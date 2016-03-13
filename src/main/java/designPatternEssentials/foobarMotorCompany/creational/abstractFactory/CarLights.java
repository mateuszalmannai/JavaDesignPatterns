package main.designPatternEssentials.foobarMotorCompany.creational.abstractFactory;

public class CarLights implements Lights {
  @Override
  public String getLights() {
    return "Car Lights";
  }
}
