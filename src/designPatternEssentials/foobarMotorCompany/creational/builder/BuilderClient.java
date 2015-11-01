package designPatternEssentials.foobarMotorCompany.creational.builder;

import designPatternEssentials.foobarMotorCompany.common.*;

public class BuilderClient {

  /**
   * The required Builder object is constructed and passed to the required Director
   * object, after which the build method is invoked to build the product and then
   * retrieve the finished article.
   * @param args
   */
  public static void main(String[] args) {
    final AbstractCar car = new Saloon(new StandardEngine(1300));
    final VehicleBuilder carBuilder = new CarBuilder(car);
    final VehicleDirector carDirector = new CarDirector();
    final Vehicle vehicle = carDirector.build(carBuilder);
    System.out.println(vehicle);

    final AbstractVan van = new BoxVan(new StandardEngine(1500));
    final VehicleBuilder vanBuilder = new VanBuilder(van);
    final VehicleDirector vanDirector = new VanDirector();
    final Vehicle vehicle1 = vanDirector.build(vanBuilder);
    System.out.println(vehicle1);
  }
}
