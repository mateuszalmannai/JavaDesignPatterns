package designPatternEssentials.foobarMotorCompany.structural.decorator;

import designPatternEssentials.foobarMotorCompany.common.Engine;

public abstract class AbstractVehicle implements Vehicle {

  private Engine engine;
  private Vehicle.Colour colour;

  public AbstractVehicle(Engine engine) {
    this(engine, Colour.UNPAINTED);
  }

  public AbstractVehicle(Engine engine, Colour colour) {
    this.engine = engine;
    this.colour = colour;
  }

  @Override
  public Engine getEngine() {
    return engine;
  }

  @Override
  public Colour getColour() {
    return colour;
  }

  public void paint(Vehicle.Colour colour) {
    this.colour = colour;
  }

  public String toString() {
    return getClass().getSimpleName() + " (" + engine + ", " + colour + ", price " + getPrice() + ")";
  }

}
