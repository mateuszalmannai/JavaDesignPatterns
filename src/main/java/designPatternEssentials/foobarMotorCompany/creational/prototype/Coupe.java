package main.designPatternEssentials.foobarMotorCompany.creational.prototype;

import main.designPatternEssentials.foobarMotorCompany.common.Engine;

public class Coupe extends AbstractCar {
  public Coupe(Engine engine) {
    this(engine, Colour.UNPAINTED);
  }

  public Coupe(Engine engine, Colour colour) {
    super(engine, colour);
  }
}
