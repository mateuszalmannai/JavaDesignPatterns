package creational.singleton.balzhoczer;

/**
 * Best solution in a concurrent environment
 */
public enum ThreadSafeSingletonEnum {

  INSTANCE;

  private int counter;

  public void setCounter(int counter) {
    this.counter = counter;
  }

  public int getCounter() {
    return counter;
  }
}
