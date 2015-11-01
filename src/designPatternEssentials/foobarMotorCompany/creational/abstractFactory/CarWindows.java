package designPatternEssentials.foobarMotorCompany.creational.abstractFactory;

public class CarWindows implements Windows {
  @Override
  public String getWindowParts() {
    return "Window glassware for a car";
  }
}
