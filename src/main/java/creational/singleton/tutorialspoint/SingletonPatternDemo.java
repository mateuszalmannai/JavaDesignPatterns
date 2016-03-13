package main.creational.singleton.tutorialspoint;

public class SingletonPatternDemo {
  public static void main(String[] args) {

    // Illegal construct
    // Compile-time error: The constructor SingleObject() is not visible
    // SingleObject object = new SingleObject();

    // Get the only object available
    SingleObject object = SingleObject.getInstance();

    // Show message
    object.showMessage();
  }
}
