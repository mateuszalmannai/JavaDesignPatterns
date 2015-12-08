package structural.balazsholczer;

public class DecoratorClient {
  public static void main(String[] args) {
    Beverage milkWithTwoSugars = new Sugar(new Sugar(new Milk(new PlainBeverage())));

    System.out.println(milkWithTwoSugars.getCost());
    System.out.println(milkWithTwoSugars.getDescription());
  }
}
