package main.designPatternEssentials.foobarMotorCompany.behavioural.observer.observerWithEventsAndListeners;

import java.util.ArrayList;
import java.util.List;

/**
 * Modified Speedometer class that no longer extends java.util.Observable
 * and instead handles listener registration and notification internally.
 */
public class EventListenerSpeedometer {
  private int currentSpeed;
  private List<SpeedometerListener> listeners;

  public EventListenerSpeedometer() {
    currentSpeed = 0;
    listeners = new ArrayList<SpeedometerListener>();
  }

  public int getCurrentSpeed() {
    return currentSpeed;
  }

  public void setCurrentSpeed(int currentSpeed) {
    this.currentSpeed = currentSpeed;
    // Tell all observers so they know speed has changed
    fireSpeedChanged();
  }

  public void addSpeedometerListener(SpeedometerListener speedometerListener) {
    listeners.add(speedometerListener);
  }

  public void removeSpeedometerListener(SpeedometerListener speedometerListener) {
    listeners.remove(speedometerListener);
  }

  private void fireSpeedChanged() {
    SpeedometerEvent speedometerEvent = new SpeedometerEvent(this, getCurrentSpeed());
    for (SpeedometerListener listener : listeners) {
      listener.speedChanged(speedometerEvent);
    }
  }
}
