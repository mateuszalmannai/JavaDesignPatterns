package main.structural.adpater.balazsholczer;

public class Car implements Vehicle {
  @Override
  public void accelerate() {
    System.out.println(this.getClass().getSimpleName() + " accelerating...");
  }
}
