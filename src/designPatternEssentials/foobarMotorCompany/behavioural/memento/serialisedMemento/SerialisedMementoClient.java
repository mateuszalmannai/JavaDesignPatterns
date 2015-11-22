package designPatternEssentials.foobarMotorCompany.behavioural.memento.serialisedMemento;

import java.io.IOException;

public class SerialisedMementoClient {
  public static void main(String[] args) {
    Speedometer speedometer = new Speedometer();
    speedometer.setCurrentSpeed(50);
    speedometer.setCurrentSpeed(100);

    System.out.println("Current speed: " + speedometer.getCurrentSpeed());
    System.out.println("Previous speed: " + speedometer.getPreviousSpeed());

    // Save the state of 'speedometer'
    SpeedometerMemento memento = null;
    try {
      memento = new SpeedometerMemento(speedometer);
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Change the state of 'speedometer'
    speedometer.setCurrentSpeed(80);
    System.out.println("After setting to 80...");
    System.out.println("Current speed: " + speedometer.getCurrentSpeed());
    System.out.println("Previous speed: " + speedometer.getPreviousSpeed());

    // Restore the state of 'speedometer'...
    System.out.println("Now restoring state...");
    Speedometer restoredSpeedometer = null;
    try {
      restoredSpeedometer = memento.restoreState();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    System.out.println("Current speed: " + restoredSpeedometer.getCurrentSpeed());
    System.out.println("Previous speed: " + restoredSpeedometer.getPreviousSpeed());




  }
}
