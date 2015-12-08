package designPatternEssentials.foobarMotorCompany.behavioural.observer;

import java.util.Observable;

/**
 * The Speedometer class extends java.util.Observable and thus inherits
 * for our convenience its methods concerned with the registration and
 * notification of observers.
 * Whenever the speed changes we invoke the inherited setChanged() and
 * notifyObservers() methods which takes care of the notification for us.
 *
 * The inherited code that makes Observable classes work does have an
 * obvious downside; if your subject calss already extends another class
 * then you can't extend it as well, since Java only supports single objectOrientedConcepts
 * of classes.
 */
public class Speedometer extends Observable {
  private int currentSpeed;

  public Speedometer() {
    currentSpeed = 0;
  }

  public int getCurrentSpeed() {
    return currentSpeed;
  }

  public void setCurrentSpeed(int currentSpeed) {
    this.currentSpeed = currentSpeed;
    // Tell all observers so they know speed has changed
    setChanged();
    notifyObservers();
  }
}
