package designPatternEssentials.foobarMotorCompany.common;

public abstract class AbstractCar extends AbstractVehicle {

  public AbstractCar(Engine engine) {
    this(engine, Vehicle.Colour.UNPAINTED);
  }


  public AbstractCar(Engine engine, Vehicle.Colour coulour) {
    super(engine, coulour);
  }
}
