package main.designPatternEssentials.foobarMotorCompany.behavioural.memento;

/**
 * Note that the accessor method getCurrentSpeed() is used for the
 * currentSpeed instance variable but the previousSpeed variable
 * has to be accessed directly, which is possible because the
 * memento exists in the same package
 *
 * The main disadvantage of this approach is that you either have
 * to put the pair of classes in their own special package or accept
 * that other classes in the package they are in will have direct
 * access to the instance variables.
 */
public class SpeedometerMemento {
  private Speedometer speedometer;

  private int copyOfCurrentSpeed;
  private int copyOfPreviousSpeed;

  public SpeedometerMemento(Speedometer speedometer) {
    this.speedometer = speedometer;
    copyOfCurrentSpeed = speedometer.getCurrentSpeed();
    copyOfPreviousSpeed = speedometer.previousSpeed;
  }

  public void restoreState(){
    speedometer.setCurrentSpeed(copyOfCurrentSpeed);
    speedometer.previousSpeed = copyOfPreviousSpeed;
  }
}
