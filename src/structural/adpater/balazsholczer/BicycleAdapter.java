package structural.adpater.balazsholczer;


/**
 * We hide the Vehicle properties behind the Vehicle interface
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
