package creational.factory.video2brain.withFactoryMethod;

public class FactoryMethodClient {
  public static void main(String[] args) {
    Meal meal = Cantine.getMeal();
    System.out.println("What's cooking?");
    System.out.println("-> " + meal.getDescription());
  }
}
