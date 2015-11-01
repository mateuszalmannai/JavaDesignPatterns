package creational.singleton.javacodegeeks;

/**
 * The one problem with this approach is that, the object would get created as soon
 * as the class gets loaded into the JVM. If the object is never requested, there
 * would be a useless object in memory.
 */
public class SingletonEager {
  // provide a global variable to make an object accessible
  private static SingletonEager singletonEager = new SingletonEager();

  // Stop the class getting instantiated outside the class
  private SingletonEager(){
    // Although there is only a single copy of a static variable of a class,
    // without the private constructor, if a client uses the 'new' operator,
    // there would be a new instance of this class
    // By keeping the constructor private no other class can instantiate this class
  }

  // Providing direct access to a class member is not a good idea, hence we provide
  // an accessor method for indirect access
  public static SingletonEager getInstance(){
    return singletonEager;
  }

}
