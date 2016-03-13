package main.designPatternEssentials.foobarMotorCompany.creational.prototype;

import main.designPatternEssentials.foobarMotorCompany.common.Engine;

public abstract class AbstractCar extends AbstractVehicle {

  public AbstractCar(Engine engine) {
    this(engine, Colour.UNPAINTED);
  }


  public AbstractCar(Engine engine, Colour coulour) {
    super(engine, coulour);
  }
}
