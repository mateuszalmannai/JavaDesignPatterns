package main.designPatternEssentials.foobarMotorCompany.otherPatterns.nullObject;

public class OilLevelLight implements WarningLight {
  private boolean on;

  @Override
  public void turnOn() {
    on = true;
    System.out.println("Oil level light ON");
  }

  @Override
  public void turnOff() {
    on = false;
    System.out.println("Oil level light OFF");
  }

  @Override
  public boolean isOn() {
    return on;
  }
}
