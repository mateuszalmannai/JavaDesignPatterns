package main.designPatternEssentials.foobarMotorCompany.creational.builder;

import main.designPatternEssentials.foobarMotorCompany.common.Vehicle;

public abstract class VehicleDirector {
  public abstract Vehicle build(VehicleBuilder builder);
}
