package main.designPatternEssentials.foobarMotorCompany.creational.prototype;

import main.designPatternEssentials.foobarMotorCompany.common.Engine;

public class BoxVan extends AbstractVan {
  public BoxVan(Engine engine) {
    this(engine, Colour.UNPAINTED);
  }

  public BoxVan(Engine engine, Colour colour) {
    super(engine, colour);
  }
}
