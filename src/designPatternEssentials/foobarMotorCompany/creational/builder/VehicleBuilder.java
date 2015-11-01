package designPatternEssentials.foobarMotorCompany.creational.builder;

import designPatternEssentials.foobarMotorCompany.common.Vehicle;

/**
 * This class defines all possible 'build' methods for both cars and
 * vans, and provides empty implementations for each as a default.
 * The abstract getVehicle() method is for returning the finished vehicle.
 *
 */
public abstract class VehicleBuilder {
  public VehicleBuilder buildBody(){return this;}
  public VehicleBuilder buildBoot(){return this;}
  public VehicleBuilder buildChassis(){return this;}
  public VehicleBuilder buildPassengerArea(){return this;}
  public VehicleBuilder buildReinforcedStorageArea(){return this;}
  public VehicleBuilder buildWindows(){return this;}

  public abstract Vehicle getVehicle();
}
