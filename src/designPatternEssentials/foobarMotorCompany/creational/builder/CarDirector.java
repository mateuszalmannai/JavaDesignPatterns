package designPatternEssentials.foobarMotorCompany.creational.builder;

import designPatternEssentials.foobarMotorCompany.common.Vehicle;

public class CarDirector extends VehicleDirector {
  @Override
  public Vehicle build(VehicleBuilder builder) {
    return builder.buildChassis().buildBody().buildPassengerArea().buildBoot().buildWindows().getVehicle();
//    builder.buildBody();
//    builder.buildPassengerArea();
//    builder.buildBoot();
//    builder.buildWindows();
//    return builder.getVehicle();
  }
}
