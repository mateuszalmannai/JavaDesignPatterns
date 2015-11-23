package designPatternEssentials.foobarMotorCompany.behavioural.observer.observerWithEventsAndListeners;

public class EventListenerObserverClient {
  public static void main(String[] args) {
    // Create a listener
    SpeedMonitor monitor = new SpeedMonitor();


    // Create a speedometer and register the monitor with it...
    EventListenerSpeedometer speedometer = new EventListenerSpeedometer();
    speedometer.addSpeedometerListener(new AutomaticGearbox());
    speedometer.addSpeedometerListener(monitor);

    // Drive at different speeds...
    speedometer.setCurrentSpeed(10);
    speedometer.setCurrentSpeed(20);
    speedometer.setCurrentSpeed(30);
    speedometer.setCurrentSpeed(100);
    speedometer.setCurrentSpeed(69);

  }
}
