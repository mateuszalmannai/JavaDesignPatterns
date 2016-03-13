package main.behavioral.observer.video2brain.withImprovedObserver;

public class TemperatureGauge implements Observer<Integer> {
  @Override
  public void changeValue(Integer newValue) {
    System.out.println(this.getClass().getSimpleName() + " reports the current temperature as: " + newValue + " degrees.");
  }
}
