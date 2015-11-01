package designPatternEssentials.foobarMotorCompany.creational.Singleton;

/**
 * Sometimes you may want a specific number of different singletons that perform
 * the same actions (a so-called Multiton, a contraction of "multiple singleton").
 * This is not that straightforward using the traditional approach, but when using
 * the enum technique it is as easy as defining separate constants.
 */
public enum MultitonSerialNumberGenerator {
  ENGINE, VEHICLE;

  private int count;

  public synchronized int getNextSerial(){
    return ++count;
  }

}
