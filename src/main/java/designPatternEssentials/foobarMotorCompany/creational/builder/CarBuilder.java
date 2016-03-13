package main.designPatternEssentials.foobarMotorCompany.creational.builder;

import main.designPatternEssentials.foobarMotorCompany.common.AbstractCar;
import main.designPatternEssentials.foobarMotorCompany.common.Vehicle;

public class CarBuilder extends VehicleBuilder {

  private AbstractCar carInProgress;

  public CarBuilder(AbstractCar car) {
    this.carInProgress = car;
  }

  @Override
  public VehicleBuilder buildBody() {
    // Add body to carInProgress
    System.out.println("building car body");
    return this;
  }

  @Override
  public VehicleBuilder buildBoot() {
    // Add boot to carInProgress
    System.out.println("building car boot");
    return this;
  }

  @Override
  public VehicleBuilder buildChassis() {
    // Add chassis to carInProgress
    System.out.println("building car chassis");
    return this;
  }

  @Override
  public VehicleBuilder buildPassengerArea() {
    // Add passenger area to carInProgress
    System.out.println("building car passenger area");
    return this;
  }

  @Override
  public VehicleBuilder buildWindows() {
    // Add windows to carInProgress
    System.out.println("building car windows");
    return this;
  }

  @Override
  public Vehicle getVehicle() {
    return carInProgress;
  }
}
