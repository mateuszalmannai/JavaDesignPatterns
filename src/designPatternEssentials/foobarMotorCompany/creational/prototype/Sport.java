package designPatternEssentials.foobarMotorCompany.creational.prototype;

import designPatternEssentials.foobarMotorCompany.common.Engine;

public class Sport extends AbstractCar {
  public Sport(Engine engine) {
    this(engine, Colour.UNPAINTED);
  }

  public Sport(Engine engine, Colour colour) {
    super(engine, colour);
  }
}
