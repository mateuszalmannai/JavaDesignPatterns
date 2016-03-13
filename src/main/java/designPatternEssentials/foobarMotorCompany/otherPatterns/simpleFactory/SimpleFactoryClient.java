package main.designPatternEssentials.foobarMotorCompany.otherPatterns.simpleFactory;

public class SimpleFactoryClient {
  public static void main(String[] args) {
    // Create an automatic gearbox
    Gearbox automatic = GearboxFactory.create(GearboxFactory.Type.AUTOMATIC);

    // Create a manual gearbox
    Gearbox manual = GearboxFactory.create(GearboxFactory.Type.MANUAL);

  }
}
