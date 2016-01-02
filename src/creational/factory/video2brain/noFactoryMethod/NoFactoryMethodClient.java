package creational.factory.video2brain.noFactoryMethod;

import java.util.Date;

public class NoFactoryMethodClient {
  public static void main(String[] args) {
    Date now = new Date();
    int hour = now.getHours();
    System.out.println("What's cooking?");
    if (6 <= hour && hour < 11) {
      Breakfast meal = new Breakfast();
      System.out.println("-> " + meal.getDescription());
    } else if (11 <= hour && hour < 16) {
      Lunch meal = new Lunch();
      System.out.println("-> " + meal.getDescription());
    } else if (16 <= hour && hour < 22) {
      Dinner meal = new Dinner();
      System.out.println("-> " + meal.getDescription());
    } else {
      NoMeal meal = new NoMeal();
      System.out.println("-> " + meal.getDescription());
    }

  }
}
