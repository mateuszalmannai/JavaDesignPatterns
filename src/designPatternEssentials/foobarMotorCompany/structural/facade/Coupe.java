package designPatternEssentials.foobarMotorCompany.structural.facade;

import designPatternEssentials.foobarMotorCompany.common.Engine;

public class Coupe extends AbstractCar {
  public Coupe(Engine engine) {
    this(engine, Colour.UNPAINTED);
  }

  public Coupe(Engine engine, Colour colour) {
    super(engine, colour);
  }
}
