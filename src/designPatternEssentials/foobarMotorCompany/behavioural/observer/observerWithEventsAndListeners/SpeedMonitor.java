package designPatternEssentials.foobarMotorCompany.behavioural.observer.observerWithEventsAndListeners;

public class SpeedMonitor implements SpeedometerListener {
  private static final int SPEED_TO_ALERT = 70;

  @Override
  public void speedChanged(SpeedometerEvent event) {
    if (event.getSpeed() > SPEED_TO_ALERT) {
      System.out.println("** ALERT ** Driving too fast! (" + event.getSpeed() + ")");
    } else {
      System.out.println("... nice and steady ... (" + event.getSpeed() + ")");
    }

  }
}
