package designPatternEssentials.foobarMotorCompany.behavioural.memento.serialisedMemento;

import java.io.Serializable;

/**
 * This approach allow you to make all the instance variables private,
 * thus regaining full encapsulation.
 */
public class Speedometer implements Serializable {
  private int currentSpeed;

  private int previousSpeed;


  public Speedometer() {
    currentSpeed = 0;
    previousSpeed = 0;
  }

  public int getCurrentSpeed() {
    return currentSpeed;
  }

  // Only defined to help testing
  public int getPreviousSpeed() {
    return previousSpeed;
  }

  public void setCurrentSpeed(int speed) {

    previousSpeed = currentSpeed;
    currentSpeed = speed;
  }
}
