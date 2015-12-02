package designPatternEssentials.foobarMotorCompany.otherPatterns.modelViewController;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

/**
 * The only link with other classes is through its observers, using
 * the PropertyChangeSupport class in the java.beans package
 * Each time the direction or speed is modified its observers (also known as listeners)
 * are notified.
 */
public class SatNavModel implements Serializable{
  // Used when notifying listeners so they know what has changed
  public static final String DIRECTION_CHANGE = "direction";
  public static final String SPEED_CHANGE = "speed";

  // The directions we can travel
  public enum Direction {NORTH, SOUTH, EAST, WEST}

  // The current direction and speed
  private Direction currentDirection;
  private int currentSpeed;

  // This class is observable
  private PropertyChangeSupport changeSupport;

  public SatNavModel() {
    currentDirection = Direction.NORTH;
    currentSpeed = 0;
    changeSupport = new PropertyChangeSupport(this);
  }

  public void setDirection(Direction newDirection) {
    if (newDirection != currentDirection) {
      Direction previousDirection = currentDirection;
      currentDirection = newDirection;
      changeSupport.firePropertyChange(DIRECTION_CHANGE, previousDirection, currentDirection);
    }
  }

  public Direction getCurrentDirection() {
    return currentDirection;
  }

  public void setSpeed(int newSpeed) {
    if (newSpeed != currentSpeed) {
      int previousSpeed = currentSpeed;
      currentSpeed = newSpeed;
      changeSupport.firePropertyChange(SPEED_CHANGE, previousSpeed, currentSpeed);
    }
  }

  public int getSpeed() {
    return currentSpeed;
  }

  public void addPropertyChangeListener(PropertyChangeListener pcl) {
    changeSupport.addPropertyChangeListener(pcl);
  }

  public void removePropertyChangeListener(PropertyChangeListener pcl) {
    changeSupport.removePropertyChangeListener(pcl);
  }

}
