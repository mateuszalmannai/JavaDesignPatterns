package creational.singleton.balzhoczer;

/**
 * Eager version: instance created directly in the beginning
 */
public class NotThreadSafeEagerSingleton {


  private static NotThreadSafeEagerSingleton instance = new NotThreadSafeEagerSingleton();

  private int counter;

  /**
   * Cannot be instantiated
   */
  private NotThreadSafeEagerSingleton() {}

  public static NotThreadSafeEagerSingleton getInstance(){
    return NotThreadSafeEagerSingleton.instance;
  }

  public int getCounter() {
    return counter;
  }

  public void setCounter(int counter) {
    this.counter = counter;
  }
}
