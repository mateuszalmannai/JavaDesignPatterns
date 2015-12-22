package behavioral.observer.video2brain.withImprovedObserver;

import java.util.ArrayList;
import java.util.List;

public class TemperatureSensor extends Observable<Integer>{
  private int temperature;

  public void setTemperature(int temperature) {
    this.temperature = temperature;
    statusReport();
    informObservers(temperature);
  }

  private void statusReport() {
    System.out.println(this.getClass().getSimpleName() + " reports a temperature of " + temperature + " degrees.");
  }
}
