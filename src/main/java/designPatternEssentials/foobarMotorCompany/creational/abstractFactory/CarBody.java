package main.designPatternEssentials.foobarMotorCompany.creational.abstractFactory;

public class CarBody implements Body {
  @Override
  public String getBodyParts() {
    return "Body shell parts for a car";
  }
}
