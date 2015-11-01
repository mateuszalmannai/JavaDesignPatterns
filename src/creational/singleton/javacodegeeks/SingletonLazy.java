package creational.singleton.javacodegeeks;

/**
 * It's always a good approach that an object should only get created when it is required
 * This class creates an object of the first call and will return the same object on successive calls
 *
 * This code will fail in a multi-threaded environment.
 * If two threads were to concurrently access the class, thread t1 would call getInstance() first,
 * check if the static variable singletonLazy is null and then get interrupted for some reason.
 * Another thread t2 calls the getInstance(), successfully passes the if condition and instantiates the object.
 * Then thread1 would wake up and also create an instance of the object, making it two instances of this class.
 */
public class SingletonLazy {

  private static SingletonLazy singletonLazy = null;

  private SingletonLazy() {}

  // On the first call when singletonLazy is null the object gets created
  // and on successive calls the same object is returned
  public static SingletonLazy getInstance(){
    if (singletonLazy == null) {
      singletonLazy = new SingletonLazy();
    }
    return singletonLazy;
  }
}
