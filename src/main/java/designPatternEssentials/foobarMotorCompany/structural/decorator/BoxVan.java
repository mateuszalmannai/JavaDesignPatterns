package main.designPatternEssentials.foobarMotorCompany.structural.decorator;

import main.designPatternEssentials.foobarMotorCompany.common.Engine;

public class BoxVan extends AbstractCar {

  public BoxVan(Engine engine) {
    this(engine, Colour.UNPAINTED);
  }

  public BoxVan(Engine engine, Colour colour) {
    super(engine, colour);
  }

  @Override
  public int getPrice() {
    return 10000;
  }
}
