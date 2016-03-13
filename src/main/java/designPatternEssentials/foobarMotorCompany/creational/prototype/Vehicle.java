package main.designPatternEssentials.foobarMotorCompany.creational.prototype;

import main.designPatternEssentials.foobarMotorCompany.common.Engine;

public interface Vehicle extends Cloneable {
  public enum Colour {UNPAINTED, BLUE, BLACK, GREEN, RED, SILVER, WHITE, YELLOW}

  public Engine getEngine();

  public Vehicle.Colour getColour();

  public void paint(Vehicle.Colour colour);

  public Object clone();
}
