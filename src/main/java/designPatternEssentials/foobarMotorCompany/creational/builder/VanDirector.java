package main.designPatternEssentials.foobarMotorCompany.creational.builder;

import main.designPatternEssentials.foobarMotorCompany.common.Vehicle;

public class VanDirector extends VehicleDirector {
  @Override
  public Vehicle build(VehicleBuilder builder) {
    return builder.buildChassis().buildBody().buildReinforcedStorageArea().buildWindows().getVehicle();
  }
}
