package main.creational.singleton.javacodegeeks;

/**
 * With double-checked locking we first check to see if an instance exists and if not we synchronize.
 * This way only the first call to getInstance is synchronized.
 * Apart from this, there are other ways to break the main.creational.singleton pattern:
 * 1. If the class is serializable
 * 2. If it's cloneable
 * 3. By reflection
 * 4. When loaded by multiple class loaders
 */
public class SingletonLazyDoubleCheckedLocking {

  private volatile static SingletonLazyDoubleCheckedLocking singletonLazyDoubleCheckedLocking = null;

  private SingletonLazyDoubleCheckedLocking(){}

  public static SingletonLazyDoubleCheckedLocking getInstance(){
    if (singletonLazyDoubleCheckedLocking == null) {
      synchronized (SingletonLazyDoubleCheckedLocking.class){
        if (singletonLazyDoubleCheckedLocking == null) {
          singletonLazyDoubleCheckedLocking = new SingletonLazyDoubleCheckedLocking();
        }
      }
    }
    return singletonLazyDoubleCheckedLocking;
  }
}
