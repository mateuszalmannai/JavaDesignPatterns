package main.designPatternEssentials.foobarMotorCompany.creational.abstractFactory;

public class AbstractaFactoryClient {

  public enum factoryType {CAR, VAN};

  /**
   * The client program needs to know if it making a car or a van, but once it has instantiated
   * the correct factory all the methods to create the parts can be implemented using an
   * identical set of method calls.
   *
   * The main disadvantage of the Abstract Factory pattern arises if you need to add additional
   * 'products'. For example, if we need to include Lights in the family of components, we would
   * need to amend AbstractVehicleFactory, CarFactory and VanFactory, in addition to creating a
   * new Lights hierarchy (CarLights and VanLights)
   */
  public static void main(String[] args) {

    final AbstractVehicleFactory concreteCarFactory = getConcreteFactory(factoryType.CAR);

    useConcreteFactory(concreteCarFactory);

    final AbstractVehicleFactory concreteVanFactory = getConcreteFactory(factoryType.VAN);

    useConcreteFactory(concreteVanFactory);


  }

  private static void useConcreteFactory(AbstractVehicleFactory concreteFactory) {
    final Body vehicleBody = concreteFactory.createBody();
    final Chassis vehicleChassis = concreteFactory.createChassis();
    final Windows vehicleWindows = concreteFactory.createWindows();
    final Lights vehicleLights = concreteFactory.createLights();

    // Show what's been created
    System.out.println(vehicleBody.getBodyParts());
    System.out.println(vehicleChassis.getChassisParts());
    System.out.println(vehicleWindows.getWindowParts());
    System.out.println(vehicleLights.getLights());
  }

  // Create the vehicle's component parts
  // These will either be all car parts or all van parts
  private static AbstractVehicleFactory getConcreteFactory(AbstractaFactoryClient.factoryType type) {
    AbstractVehicleFactory factory = null;
    // Create the correct 'factory' ...
    if (type.equals(factoryType.CAR)) {
      factory = new CarFactory();
    } else {
      factory = new VanFactory();
    }
    return factory;
  }
}
