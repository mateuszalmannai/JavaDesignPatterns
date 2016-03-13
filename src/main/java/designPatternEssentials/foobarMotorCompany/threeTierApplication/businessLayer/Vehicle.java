package main.designPatternEssentials.foobarMotorCompany.threeTierApplication.businessLayer;


public interface Vehicle {

  enum Colour {UNPAINTED, BLUE, BLACK, GREEN, RED, SILVER, WHITE, YELLOW}

  Engine getEngine();

  Vehicle.Colour getColour();

  void paint(Vehicle.Colour colour);


}
