package main.designPatternEssentials.foobarMotorCompany.otherPatterns.nullObject;

public class BrakeFluidLight implements WarningLight {
  private boolean on;

  @Override
  public void turnOn() {
    on = true;
    System.out.println("Brake fluid light ON");
  }

  @Override
  public void turnOff() {
    on = false;
    System.out.println("Brake fluid light OFF");
  }

  @Override
  public boolean isOn() {
    return on;
  }
}
