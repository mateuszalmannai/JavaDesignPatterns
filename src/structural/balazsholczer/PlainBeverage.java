package structural.balazsholczer;

/**
 * Description empty as this is just a wrapper class
 */
public class PlainBeverage implements Beverage {
  private int cost;

  @Override
  public int getCost() {
    return 5;
  }

  @Override
  public String getDescription() {
    return "";
  }
}
