package main.structural.adpater.balazsholczer;


/**
 * We hide the Vehicle properties behind the Vehicle interface
 * and delegate to the bicycle method with the help of
 * composition
 */
public class BicycleAdapter implements Vehicle {

  private Bicycle bicycle;

  /**
   * Constructor injection
   */
  public BicycleAdapter(Bicycle bicycle) {
    this.bicycle = bicycle;
  }

  @Override
  public void accelerate() {
    bicycle.go();
  }
}
