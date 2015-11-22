package designPatternEssentials.foobarMotorCompany.behavioural.memento;

public class MementoClient {
  public static void main(String[] args) {
    Speedometer speedometer = new Speedometer();
    speedometer.setCurrentSpeed(50);
    speedometer.setCurrentSpeed(100);

    System.out.println("Current speed: " + speedometer.getCurrentSpeed());
    System.out.println("Previous speed: " + speedometer.previousSpeed);

    // Save the state of 'speedometer'
    SpeedometerMemento memento = new SpeedometerMemento(speedometer);

    // Change the state of 'speedometer'
    speedometer.setCurrentSpeed(80);
    System.out.println("After setting to 80...");
    System.out.println("Current speed: " + speedometer.getCurrentSpeed());
    System.out.println("Previous speed: " + speedometer.previousSpeed);

    // Restore the state of 'speedometer'...
    System.out.println("Now restoring state...");
    memento.restoreState();
    System.out.println("Current speed: " + speedometer.getCurrentSpeed());
    System.out.println("Previous speed: " + speedometer.previousSpeed);




  }
}
