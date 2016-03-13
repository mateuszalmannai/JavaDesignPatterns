package main.behavioral.observer.video2brain.withoutObserver;

public class CoolingSystem {

  private final int MAX_TEMPERATURE = 40; // threshold
  private boolean coolingOn;

  public void changeTemperature(int newTemperature){
    if (newTemperature > MAX_TEMPERATURE && !coolingOn) {
      activateCoolingSystem();
    } else if (newTemperature <= MAX_TEMPERATURE && coolingOn) {
      deactivateCoolingSystem();
    }
  }

  private void activateCoolingSystem() {
    coolingOn = true;
    System.out.println(this.getClass().getSimpleName() + " activated.");
  }

  private void deactivateCoolingSystem(){
    coolingOn = false;
    System.out.println(this.getClass().getSimpleName() + " deactivated.");
  }
}
