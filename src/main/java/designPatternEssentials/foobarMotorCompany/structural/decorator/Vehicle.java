package main.designPatternEssentials.foobarMotorCompany.structural.decorator;

import main.designPatternEssentials.foobarMotorCompany.common.Engine;

public interface Vehicle {
  enum Colour {UNPAINTED, BLUE, BLACK, GREEN, RED, SILVER, WHITE, YELLOW}

  Engine getEngine();

  void paint(Vehicle.Colour colour);

  Vehicle.Colour getColour();

  int getPrice();

}
