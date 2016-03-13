package main.designPatternEssentials.foobarMotorCompany.creational.prototype;

import main.designPatternEssentials.foobarMotorCompany.common.Engine;

public class Saloon extends AbstractCar {

  public Saloon(Engine engine) {
    this(engine, Colour.UNPAINTED);
  }

  public Saloon(Engine engine, Colour colour) {
    super(engine, colour);
  }

}
