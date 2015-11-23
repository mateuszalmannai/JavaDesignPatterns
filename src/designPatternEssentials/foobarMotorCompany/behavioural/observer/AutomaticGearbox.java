package designPatternEssentials.foobarMotorCompany.behavioural.observer;

import java.util.Observable;
import java.util.Observer;

public class AutomaticGearbox implements Observer {

  @Override
  public void update(Observable observable, Object argument) {
    Speedometer speedometer = (Speedometer) observable;
    if (speedometer.getCurrentSpeed() <= 10) {
      System.out.println("Now in first gear");
    } else if (speedometer.getCurrentSpeed() <= 20) {
      System.out.println("Now in second gear");
    } else if (speedometer.getCurrentSpeed() <= 30) {
      System.out.println("Now in third gear");
    } else {
      System.out.println("Now in fourth gear");
    }
  }
}
