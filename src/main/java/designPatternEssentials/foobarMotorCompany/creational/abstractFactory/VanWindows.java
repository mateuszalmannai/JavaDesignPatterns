package main.designPatternEssentials.foobarMotorCompany.creational.abstractFactory;

public class VanWindows implements Windows {
  @Override
  public String getWindowParts() {
    return "Window glassware for a van";
  }
}
