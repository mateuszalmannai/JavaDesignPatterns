package main.designPatternEssentials.foobarMotorCompany.behavioural.memento;

public class Speedometer {
  // Normal private visibility bus has accessor method...
  private int currentSpeed;

  // package-private visibility and no accessor method...
  int previousSpeed;


  public Speedometer() {
    currentSpeed = 0;
    previousSpeed = 0;
  }

  public int getCurrentSpeed() {
    return currentSpeed;
  }

  public void setCurrentSpeed(int speed) {

    previousSpeed = currentSpeed;
    this.currentSpeed = speed;
  }
}
