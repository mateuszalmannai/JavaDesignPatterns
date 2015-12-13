package structural.adpater.balazsholczer;


public class Bus implements Vehicle {
  @Override
  public void accelerate() {
    System.out.println(this.getClass().getSimpleName() + " accelerating...");
  }
}
