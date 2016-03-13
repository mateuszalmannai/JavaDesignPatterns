package main.creational.singleton.javacodegeeks;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 1. If the class is serializable implement the readResolve() and writeReplace() methods in the Singleton class
 *    and return the same object through them.
 * 2. If it's cloneable implement the clone() method and throw an exception so that the main.creational.singleton cannot be cloned.
 * 3. An if condition inside the constructor can prevent the main.creational.singleton from getting instantiated more than once
 *    using reflection.
 * 4. To prevent the main.creational.singleton getting instantiated by multiple class loaders you can implement the getClass()
 *    method, which associates the classloader with the current thread; if that classloader si null, the method
 *    uses the same classloader that loaded the main.creational.singleton class.
 */
public class Singleton implements Serializable {
  private static final long serialVersionUID = -1093810940935189395L;
  private static Singleton singleton = new Singleton();
  private Singleton(){
    if (singleton != null) {
      throw new IllegalStateException("Singleton already created!");
    }
  }
  public static Singleton getInstance(){
    return singleton;
  }

  private Object readResolve() throws ObjectStreamException{
    return singleton;
  }

  private Object writeReplace() throws ObjectStreamException{
    return singleton;
  }

  public Object clone() throws CloneNotSupportedException{
    throw new CloneNotSupportedException("Singleton cannot be cloned");
  }

  private static Class getClass(String className) throws ClassNotFoundException {
    ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
    if (classLoader == null) {
      classLoader = Singleton.class.getClassLoader();
    }
    return (classLoader.loadClass(className));
  }
}
