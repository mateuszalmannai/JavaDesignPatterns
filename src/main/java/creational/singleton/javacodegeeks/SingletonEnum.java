package main.creational.singleton.javacodegeeks;

/**
 * As of JDK 1.5 there is a simple way of creating a main.creational.singleton class.
 * Enum constants are implicitly static and final so that the values cannot be changed once created.
 * You will get a compile-time error when you attempt to explicitly instantiate an Enum object.
 * Since the Enum gets loaded statically it is thread-safe.
 * The clone method in Enum is final which ensures that enum constants never get cloned.
 * Enum is inherently serializable and the serialization mechanism ensures that duplicate instances are
 * never created as a result of deserialization.
 * Instantiation using reflection is also prohibited
 * All the above ensure that no instance of an enum exist beyond the one defined by the enum constants.
 */
public class SingletonEnum {
  public enum SingleEnum {
    SINGLETON_ENUM;
  }
}
