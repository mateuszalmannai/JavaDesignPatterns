package main.designPatternEssentials.foobarMotorCompany.structural.strategy;

import main.designPatternEssentials.foobarMotorCompany.common.Engine;

public class StandardGearboxStrategy implements GearboxStrategy {

  @Override
  public void ensureCorrectGear(Engine engine, int speed) {
    int engineSize = engine.getSize();
    boolean turbo = engine.isTurbo();

    // some complicated code to determine correct gear
    // setting based on engineSize, turbo & speed, etc.
    // ... omitted ...
    System.out.println("Working out correct gear at " + speed + "mph for a STANDARD gearbox");
  }
}
