package designPatternEssentials.foobarMotorCompany.structural.facade;

import designPatternEssentials.foobarMotorCompany.common.Engine;

public abstract class AbstractCar extends AbstractVehicle {

  public AbstractCar(Engine engine) {
    this(engine, Colour.UNPAINTED);
  }


  public AbstractCar(Engine engine, Colour colour) {
    super(engine, colour);
  }
}
