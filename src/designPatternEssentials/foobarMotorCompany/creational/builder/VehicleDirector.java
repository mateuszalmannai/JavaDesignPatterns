package designPatternEssentials.foobarMotorCompany.creational.builder;

import designPatternEssentials.foobarMotorCompany.common.Vehicle;

public abstract class VehicleDirector {
  public abstract Vehicle build(VehicleBuilder builder);
}
