package designPatternEssentials.foobarMotorCompany.creational.prototype;

import designPatternEssentials.foobarMotorCompany.common.Engine;

public abstract class AbstractVan extends AbstractVehicle {
  public AbstractVan(Engine engine) {
    this(engine, Colour.UNPAINTED);
  }

  public AbstractVan(Engine engine, Colour colour) {
    super(engine, colour);

  }
}
