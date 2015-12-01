package designPatternEssentials.foobarMotorCompany.otherPatterns.nullObject;

public class NullObjectLight implements WarningLight{
  @Override
  public void turnOn() {
    // Do nothing...
  }

  @Override
  public void turnOff() {
    // Do nothing...
  }

  @Override
  public boolean isOn() {
    return false;
  }
}
