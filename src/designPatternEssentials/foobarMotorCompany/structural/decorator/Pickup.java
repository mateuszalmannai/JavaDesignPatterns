package designPatternEssentials.foobarMotorCompany.structural.decorator;

import designPatternEssentials.foobarMotorCompany.common.Engine;

public class Pickup extends AbstractCar {

  public Pickup(Engine engine) {
    this(engine, Colour.UNPAINTED);
  }

  public Pickup(Engine engine, Colour colour) {
    super(engine, colour);
  }

  @Override
  public int getPrice() {
    return 9000;
  }
}
