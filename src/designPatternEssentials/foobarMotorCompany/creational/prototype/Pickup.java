package designPatternEssentials.foobarMotorCompany.creational.prototype;

import designPatternEssentials.foobarMotorCompany.common.Engine;

public class Pickup extends AbstractVan {
  public Pickup(Engine engine) {
    this(engine, Colour.UNPAINTED);
  }

  public Pickup(Engine engine, Colour colour) {
    super(engine, colour);
  }
}
