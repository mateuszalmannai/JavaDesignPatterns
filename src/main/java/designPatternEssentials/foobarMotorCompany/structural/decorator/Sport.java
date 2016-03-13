package main.designPatternEssentials.foobarMotorCompany.structural.decorator;

import main.designPatternEssentials.foobarMotorCompany.common.Engine;

public class Sport extends AbstractCar {

  public Sport(Engine engine) {
    this(engine, Colour.UNPAINTED);
  }

  public Sport(Engine engine, Colour colour) {
    super(engine, colour);
  }

  @Override
  public int getPrice() {
    return 8000;
  }
}
