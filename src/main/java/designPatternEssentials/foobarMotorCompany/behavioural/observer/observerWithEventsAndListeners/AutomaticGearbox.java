package main.designPatternEssentials.foobarMotorCompany.behavioural.observer.observerWithEventsAndListeners;

public class AutomaticGearbox implements SpeedometerListener {

  @Override
  public void speedChanged(SpeedometerEvent event) {
    if (event.getSpeed() <= 10) {
      System.out.println("Now in first gear");
    } else if (event.getSpeed() <= 20) {
      System.out.println("Now in second gear");
    } else if (event.getSpeed() <= 30) {
      System.out.println("Now in third gear");
    } else {
      System.out.println("Now in fourth gear");
    }

  }
}
