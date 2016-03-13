package main.structural.decorator.balazsholczer;

public class Milk extends BeverageDecorator {

  private static final int MILK_COST = 3;
  private static final String MILK_DESCRIPTION = "milk";
  private Beverage beverage;


  /**
   * Inject interface in constructor
   */
  public Milk(Beverage beverage) {
    super(beverage);
    this.beverage = beverage;
  }

  @Override
  public int getCost() {
    return beverage.getCost() + MILK_COST;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + " " + MILK_DESCRIPTION;
  }
}
