package main.structural.decorator.balazsholczer;

public class Sugar extends BeverageDecorator{

  private static final String SUGAR_DESCRIPTION = "sugar";
  private static final int SUGAR_COST = 1;
  private Beverage beverage;

  /**
   * Inject interface in constructor
   */
  public Sugar(Beverage beverage) {
    super(beverage);
    this.beverage = beverage;
  }

  @Override
  public int getCost() {
    return super.getCost() + SUGAR_COST;
  }

  @Override
  public String getDescription() {
    return super.getDescription() + " " + SUGAR_DESCRIPTION;
  }
}
