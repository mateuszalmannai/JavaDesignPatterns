package designPatternEssentials.foobarMotorCompany.structural.facade;

public class VehicleFacade {
  public void prepareForSale(Vehicle vehicle) {
    final Registration registration = new Registration(vehicle);
    registration.allocateVehicleNumber();
    registration.allocateLicensePlate();

    Documentation.printBrochure(vehicle);

    vehicle.cleanInterior();
    vehicle.cleanExteriorBody();
    vehicle.polishWindows();
    vehicle.takeForTestDrive();
  }
}
