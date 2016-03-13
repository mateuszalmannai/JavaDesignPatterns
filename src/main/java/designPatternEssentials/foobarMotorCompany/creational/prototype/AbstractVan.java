package main.designPatternEssentials.foobarMotorCompany.creational.prototype;

import main.designPatternEssentials.foobarMotorCompany.common.Engine;

public abstract class AbstractVan extends AbstractVehicle {
  public AbstractVan(Engine engine) {
    this(engine, Colour.UNPAINTED);
  }

  public AbstractVan(Engine engine, Colour colour) {
    super(engine, colour);

  }
}
