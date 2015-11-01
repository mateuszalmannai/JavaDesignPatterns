package designPatternEssentials.foobarMotorCompany.common;

public abstract class AbstractVehicle implements Vehicle {
  private Engine engine;
  private Vehicle.Colour colour;

  public AbstractVehicle(Engine engine) {
    this(engine, Vehicle.Colour.UNPAINTED);
  }

  public AbstractVehicle(Engine engine, Vehicle.Colour colour) {
    this.engine = engine;
    this.colour = colour;
  }

  @Override
  public Engine getEngine() {
    return engine;
  }

  @Override
  public Vehicle.Colour getColour() {
    return colour;
  }

  @Override
  public void paint(Vehicle.Colour colour){
    this.colour = colour;
  }

  public String toString() {
    return getClass().getSimpleName() + " (" + engine + ", " + colour + ")";
  }
}
