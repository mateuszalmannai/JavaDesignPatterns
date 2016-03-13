package main.designPatternEssentials.foobarMotorCompany.creational.builder;

import main.designPatternEssentials.foobarMotorCompany.common.AbstractVan;
import main.designPatternEssentials.foobarMotorCompany.common.Vehicle;

public class VanBuilder extends VehicleBuilder {
  private AbstractVan vanInProgress;

  public VanBuilder(AbstractVan van) {
    this.vanInProgress = van;
  }

  @Override
  public VehicleBuilder buildBody() {
    // Add body to vanInProgress
    System.out.println("building van body");
    return this;
  }

  @Override
  public VehicleBuilder buildChassis() {
    //  Add chassis to vanInProgress
    System.out.println("building van chassis");
    return this;
  }

  @Override
  public VehicleBuilder buildReinforcedStorageArea() {
    // Add storage area to vanInProgress
    System.out.println("building van storage area");
    return this;
  }

  @Override
  public VehicleBuilder buildWindows() {
    // Add windows to vanInProgress
    System.out.println("building van windows");
    return this;
  }

  @Override
  public Vehicle getVehicle() {
    return vanInProgress;
  }
}
