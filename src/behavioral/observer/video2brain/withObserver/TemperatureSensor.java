package behavioral.observer.video2brain.withObserver;

import java.util.ArrayList;
import java.util.List;

public class TemperatureSensor {
  private int temperature;
  private List<TemperatureObserver> temperatureObservers = new ArrayList<>();

  public void registerTemperatureObserver(TemperatureObserver observer) {
    temperatureObservers.add(observer);
  }

  public void removeTemperatureObserver(TemperatureObserver observer) {
    temperatureObservers.remove(observer);
  }


  public void setTemperature(int temperature) {
    this.temperature = temperature;
    statusReport();
    informTemperatureObservers();
  }

  private void informTemperatureObservers() {
    for (TemperatureObserver observer : temperatureObservers) {
      observer.changeTemperature(temperature);
    }
  }

  private void statusReport() {
    System.out.println(this.getClass().getSimpleName() + " reports a temperature of " + temperature + " degrees.");
  }
}
