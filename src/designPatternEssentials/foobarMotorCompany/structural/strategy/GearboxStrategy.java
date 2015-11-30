package designPatternEssentials.foobarMotorCompany.structural.strategy;

import designPatternEssentials.foobarMotorCompany.common.Engine;

public interface GearboxStrategy {
  void ensureCorrectGear(Engine engine, int speed);
}
