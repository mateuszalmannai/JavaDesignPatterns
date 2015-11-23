package designPatternEssentials.foobarMotorCompany.behavioural.observer.observerWithEventsAndListeners;

import java.util.EventObject;

/**
 * The only event of interest is when the speed changes.
 * The inherited EventObject class provides a getSource() method
 * so listeners will be able to tell the exact object that gave
 * rise to the event, if they need to know it for some reason.
 *
 * If your classes are JavaBeans then the Java libraries also supply
 * a PropertyChangeEvent class and PropertyChangeListener interface
 * that follow a similar approach.
 */
public class SpeedometerEvent extends EventObject {
  private int speed;
  /**
   * Constructs a prototypical Event.
   *
   * @param source The object on which the Event initially occurred.
   * @throws IllegalArgumentException if source is null.
   */
  public SpeedometerEvent(Object source, int speed) {
    super(source);
    this.speed = speed;
  }

  public int getSpeed() {
    return speed;
  }
}
