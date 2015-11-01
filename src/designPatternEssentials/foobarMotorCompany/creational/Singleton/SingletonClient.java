package designPatternEssentials.foobarMotorCompany.creational.Singleton;

public class SingletonClient {
  public static void main(String[] args) {
    System.out.println("Using traditional singleton:");
    final SerialNumberGeneratorTraditional traditionalGenerator = SerialNumberGeneratorTraditional.getInstance();
    System.out.println("Next serial: " + traditionalGenerator.getNextSerial());
    System.out.println("Next serial: " + traditionalGenerator.getNextSerial());
    System.out.println("Next serial: " + traditionalGenerator.getNextSerial());

    System.out.println();
    System.out.println("Using the enum singleton:");
    System.out.println("Next vehicle: " + EnumSerialNumberGenerator.INSTANCE.getNextSerial());
    System.out.println("Next vehicle: " + EnumSerialNumberGenerator.INSTANCE.getNextSerial());
    System.out.println("Next vehicle: " + EnumSerialNumberGenerator.INSTANCE.getNextSerial());

    System.out.println();
    System.out.println("Using the enum multiton:");
    System.out.println("Next vehicle: " + MultitonSerialNumberGenerator.VEHICLE.getNextSerial());
    System.out.println("Next vehicle: " + MultitonSerialNumberGenerator.VEHICLE.getNextSerial());
    System.out.println("Next engine: " + MultitonSerialNumberGenerator.ENGINE.getNextSerial());
    System.out.println("Next vehicle: " + MultitonSerialNumberGenerator.VEHICLE.getNextSerial());
    System.out.println("Next engine: " + MultitonSerialNumberGenerator.ENGINE.getNextSerial());

  }
}
