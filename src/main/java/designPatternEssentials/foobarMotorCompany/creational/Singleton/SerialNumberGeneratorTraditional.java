package main.designPatternEssentials.foobarMotorCompany.creational.Singleton;

/**
 * The getInstance() and getNextSerial() methods are synchronized in case
 * they are called by separate threads.
 */
public class SerialNumberGeneratorTraditional {
  // static members
  private static SerialNumberGeneratorTraditional instance;

  /**
   * The getInstance() method will only instantiate the object once and so
   * the same instance will always be returned.
   * @return
   */
  public synchronized static SerialNumberGeneratorTraditional getInstance() {
    if (instance == null) {
      instance = new SerialNumberGeneratorTraditional();
    }
    return instance;
  }

  // instance variables
  private int count;

  /**
   * The constructor is private to prevent client programs from calling new,
   * thus enforcing the fact that only one object can ever be created, since
   * they can only go through the getInstance() method.
   */
  private SerialNumberGeneratorTraditional() {
  }

  // instance methods
  public synchronized int getNextSerial() {
    return ++count;
  }


}
