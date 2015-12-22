package behavioral.observer.video2brain.withObserver;

public class TemperatureGauge implements TemperatureObserver {
  @Override
  public void changeTemperature(int newTemperature) {
    System.out.println(this.getClass().getSimpleName() + " reports the current temperature as: " + newTemperature + " degrees.");
  }
}
