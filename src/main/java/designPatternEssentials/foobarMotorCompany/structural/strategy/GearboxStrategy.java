package main.designPatternEssentials.foobarMotorCompany.structural.strategy;

import main.designPatternEssentials.foobarMotorCompany.common.Engine;

public interface GearboxStrategy {
  void ensureCorrectGear(Engine engine, int speed);
}
