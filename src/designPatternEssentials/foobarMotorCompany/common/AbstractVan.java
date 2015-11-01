package designPatternEssentials.foobarMotorCompany.common;

public abstract class AbstractVan extends AbstractVehicle {
  public AbstractVan(Engine engine) {
    this(engine, Vehicle.Colour.UNPAINTED);
  }

  public AbstractVan(Engine engine, Vehicle.Colour colour) {
    super(engine, colour);

  }
}
