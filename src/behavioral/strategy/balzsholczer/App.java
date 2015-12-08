package behavioral.strategy.balzsholczer;

/**
 * Behaviour is changed at runtime dynamically
 */
public class App {
  public static void main(String[] args) {
    Manager manager = new Manager();
    manager.setStrategy(new Add());
    manager.operation(5, 5);

    manager.setStrategy(new Multiply());
    manager.operation(5, 5);
  }
}
