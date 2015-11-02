package designPatternEssentials.foobarMotorCompany.structural.facade;

import designPatternEssentials.foobarMotorCompany.common.Engine;

public interface Vehicle {

  enum Colour {UNPAINTED, BLUE, BLACK, GREEN, RED, SILVER, WHITE, YELLOW}

  Engine getEngine();

  Vehicle.Colour getColour();

  void paint(Vehicle.Colour colour);

  void cleanInterior();

  void cleanExteriorBody();

  void polishWindows();

  void takeForTestDrive();


}
