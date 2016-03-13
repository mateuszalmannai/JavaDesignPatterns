package main.structural.decorator.balazsholczer;

public class BeverageDecorator implements Beverage{

  private Beverage beverage;

  /**
   * Inject interface in constructor
   */
  public BeverageDecorator(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public int getCost() {
    return beverage.getCost();
  }

  @Override
  public String getDescription() {
    return beverage.getDescription();
  }
}
