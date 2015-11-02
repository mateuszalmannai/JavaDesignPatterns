package designPatternEssentials.foobarMotorCompany.structural.facade;

public class Registration {

  private Vehicle vehicle;

  public Registration(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public void allocateLicensePlate(){
    // Code omitted...
    System.out.println("Licence plate allocated.");
  }

  public void allocateVehicleNumber(){
    // Code omitted...
    System.out.println("Vehicle number allocated.");
  }



}
