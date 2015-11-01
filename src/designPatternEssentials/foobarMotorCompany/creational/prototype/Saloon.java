package designPatternEssentials.foobarMotorCompany.creational.prototype;

import designPatternEssentials.foobarMotorCompany.common.Engine;

public class Saloon extends AbstractCar {

  public Saloon(Engine engine) {
    this(engine, Colour.UNPAINTED);
  }

  public Saloon(Engine engine, Colour colour) {
    super(engine, colour);
  }

}
