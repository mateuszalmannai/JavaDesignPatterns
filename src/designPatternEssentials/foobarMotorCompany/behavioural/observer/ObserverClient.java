package designPatternEssentials.foobarMotorCompany.behavioural.observer;

public class ObserverClient {
  public static void main(String[] args) {
    // Create a monitor ...
    SpeedMonitor monitor = new SpeedMonitor();

    // Create a speedometer and register the monitor to it...
    Speedometer speedometer = new Speedometer();
    speedometer.addObserver(monitor);

    // add another observer
    speedometer.addObserver(new AutomaticGearbox());

    // Drive at different speeds...
    speedometer.setCurrentSpeed(10);
    speedometer.setCurrentSpeed(20);
    speedometer.setCurrentSpeed(30);
    speedometer.setCurrentSpeed(100);
    speedometer.setCurrentSpeed(69);
  }
}
