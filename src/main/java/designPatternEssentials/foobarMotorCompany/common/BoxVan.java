package main.designPatternEssentials.foobarMotorCompany.common;

public class BoxVan extends AbstractVan {
  public BoxVan(Engine engine) {
    this(engine, Vehicle.Colour.UNPAINTED);
  }

  public BoxVan(Engine engine, Vehicle.Colour colour) {
    super(engine, colour);
  }
}
