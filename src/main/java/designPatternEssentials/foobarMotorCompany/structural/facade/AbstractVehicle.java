package main.designPatternEssentials.foobarMotorCompany.structural.facade;

import main.designPatternEssentials.foobarMotorCompany.common.Engine;

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
  public void paint(Vehicle.Colour colour) {
    this.colour = colour;
  }

  public String toString() {
    return getClass().getSimpleName() + " (" + engine + ", " + colour + ")";
  }

  @Override
  public void cleanInterior() {
    System.out.println("Cleaing interior.");
  }

  @Override
  public void cleanExteriorBody() {
    System.out.println("Cleaning exterior.");
  }

  @Override
  public void polishWindows() {
    System.out.println("Polishing windows.");
  }

  @Override
  public void takeForTestDrive() {
    System.out.println("Taking " + this.toString().substring(0, 5) + " for test drive.");
  }
}
