package creational.singleton.javacodegeeks;

/**
 * The getInstance() method is synchronised to avoid concurrent access by more than a single thread.
 * Every thread is forced to wait its turn before it can enter the method.
 * No two threads will enter the method at the same time.
 * Synchronisation comes with a price: it will decrease performance. However, if the call to getInstance()
 * isn't causing a substantial overhead for your application the performance penalty can be ignored.
 * The other alternative would be to use eager instantiation.
 */
public class SingletonLazyMultithreaded {

  private static SingletonLazyMultithreaded singletonLazyMultithreaded = null;
  private SingletonLazyMultithreaded(){}
  public static synchronized SingletonLazyMultithreaded getInstance(){
    if (singletonLazyMultithreaded == null) {
      singletonLazyMultithreaded = new SingletonLazyMultithreaded();
    }
    return singletonLazyMultithreaded;
  }

}
