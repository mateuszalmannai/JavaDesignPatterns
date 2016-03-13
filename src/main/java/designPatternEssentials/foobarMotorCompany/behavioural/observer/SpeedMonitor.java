package main.designPatternEssentials.foobarMotorCompany.behavioural.observer;

import java.util.Observable;
import java.util.Observer;

public class SpeedMonitor implements Observer {
  private static final int SPEED_TO_ALERT = 70;

  @Override
  public void update(Observable observable, Object argument) {
    Speedometer speedometer = (Speedometer) observable;
    if (speedometer.getCurrentSpeed() > SPEED_TO_ALERT) {
      System.out.println("** ALERT ** Driving too fast! (" + speedometer.getCurrentSpeed() + ")");
    } else {
      System.out.println("... nice and steady ... (" + speedometer.getCurrentSpeed() + ")");
    }
  }
}
