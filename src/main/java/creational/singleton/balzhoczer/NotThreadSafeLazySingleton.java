package main.creational.singleton.balzhoczer;

/**
 * Lazy version: instance created only when
 */
public class NotThreadSafeLazySingleton {


  private static NotThreadSafeLazySingleton instance;

  private int counter;

  /**
   * Cannot be instantiated
   */
  private NotThreadSafeLazySingleton() {}

  public static NotThreadSafeLazySingleton getInstance(){
    if (NotThreadSafeLazySingleton.instance == null) {
      instance = new NotThreadSafeLazySingleton();
    }
    return NotThreadSafeLazySingleton.instance;
  }

  public int getCounter() {
    return counter;
  }

  public void setCounter(int counter) {
    this.counter = counter;
  }
}
