package behavioral.observer.video2brain.withoutObserver;

public class TemperatureSensor {
  private int temperature;
  private HeatingSystem heatingSystem;
  private CoolingSystem coolingSystem;


  // Constructor Injection
  public TemperatureSensor(HeatingSystem heatingSystem, CoolingSystem coolingSystem) {
    this.heatingSystem = heatingSystem;
    this.coolingSystem = coolingSystem;
  }

  public void setTemperature(int temperature) {
    this.temperature = temperature;
    statusReport();
    heatingSystem.changeTemperature(temperature);
    coolingSystem.changeTemperature(temperature);
  }

  private void statusReport() {
    System.out.println(this.getClass().getSimpleName() + " reports a temperature of " + temperature + " degrees.");
  }
}
