package designPatternEssentials.foobarMotorCompany.creational.Singleton;

/**
 * An arguably better way of coding singletons has existed since Java 1.5 by utilizing the enum type.
 * The constant name INSTANCE represents the singleton.
 * As in the traditional approach ther is an instance variable count and synchronized method getNextSerial(),
 * but now there is no need to define any static members or worry about a constructor.
 */
public enum EnumSerialNumberGenerator {

  INSTANCE;

  private int count;

  public synchronized int getNextSerial() {
    return ++count;
  }
}
