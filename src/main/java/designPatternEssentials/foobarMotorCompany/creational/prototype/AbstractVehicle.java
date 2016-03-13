package main.designPatternEssentials.foobarMotorCompany.creational.prototype;

import main.designPatternEssentials.foobarMotorCompany.common.Engine;

public class AbstractVehicle implements Vehicle {

  private Engine engine;

  private Vehicle.Colour colour;

  public AbstractVehicle(Engine engine) {
    this(engine, Vehicle.Colour.UNPAINTED);
  }

  public AbstractVehicle(Engine engine, Vehicle.Colour colour) {
    this.engine = engine;
    this.colour = colour;
    // ... followed by lots of time-consuming stuff
  }

  @Override
  public Engine getEngine() {
    return engine;
  }

  @Override
  public Colour getColour() {
    return colour;
  }

  @Override
  public void paint(Colour colour) {
    this.colour = colour;
  }

  @Override
  public Object clone() {
    Object object = null;
    try {
      object = super.clone();
    } catch (CloneNotSupportedException x) {
      // Should not happen ...
      x.printStackTrace();
    }
    return object;
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + " (" + engine + ", " + colour + ")";
  }
}
