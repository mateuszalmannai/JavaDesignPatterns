package main.behavioral.observer.video2brain.withObserver;

public class Client {
  public static void main(String[] args) {
    HeatingSystem heating = new HeatingSystem();
    CoolingSystem cooling = new CoolingSystem();
    TemperatureGauge gauge = new TemperatureGauge();

    TemperatureSensor sensor = new TemperatureSensor();
    sensor.registerTemperatureObserver(heating);
    sensor.registerTemperatureObserver(cooling);
    sensor.registerTemperatureObserver(gauge);

    sensor.setTemperature(0);       // neutral condition: no action taken
    System.out.println();
    sensor.setTemperature(-20);     // heating on
    System.out.println();
    sensor.setTemperature(60);      // heating off, cooling on
    System.out.println();
    sensor.setTemperature(20);      // cooling off
  }
}
