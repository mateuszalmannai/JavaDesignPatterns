package main.designPatternEssentials.foobarMotorCompany.creational.factoryMethod;

import main.designPatternEssentials.foobarMotorCompany.common.Vehicle;

/**
 * Client programs instantiate the required factory and call its build() method
 */
public class FactoryMethodClient {

  public static void main(String[] args) {
    // I want an economical car, coloured blue...
    final VehicleFactory carFactory = new CarFactory();
    final Vehicle car = carFactory.build(VehicleFactory.DrivingStyle.ECONOMICAL, Vehicle.Colour.BLUE);
    System.out.println(car);

    // I am a "white van man"
    final VehicleFactory vanFactory = new VanFactory();
    final Vehicle van = vanFactory.build(VehicleFactory.DrivingStyle.POWERFUL, Vehicle.Colour.WHITE);
    System.out.println(van);

    // Create a red sports car...
    final Vehicle sporty = VehicleFactory.make(VehicleFactory.Category.CAR, VehicleFactory.DrivingStyle.POWERFUL, Vehicle.Colour.RED);
    System.out.println(sporty);

  }
}
