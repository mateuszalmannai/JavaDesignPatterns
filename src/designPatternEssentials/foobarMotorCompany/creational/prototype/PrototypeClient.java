package designPatternEssentials.foobarMotorCompany.creational.prototype;

public class PrototypeClient {
  public static void main(String[] args) {
    final VehicleManagerEager eagerManager = new VehicleManagerEager();
    final Vehicle saloon1 = eagerManager.createSaloon();
    final Vehicle saloon2 = eagerManager.createSaloon();
    final Vehicle pickup1 = eagerManager.createPickup();

    System.out.println(saloon1);
    System.out.println(saloon2);
    System.out.println(pickup1);

    final VehicleManagerLazy lazyManager = new VehicleManagerLazy();
    final Vehicle saloon3 = lazyManager.createSaloon();
    final Vehicle saloon4 = lazyManager.createSaloon();
    final Vehicle pickup2 = lazyManager.createPickup();

    System.out.println(saloon3);
    System.out.println(saloon4);
    System.out.println(pickup2);

  }
}
