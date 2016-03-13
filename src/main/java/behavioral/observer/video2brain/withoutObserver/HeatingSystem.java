package main.behavioral.observer.video2brain.withoutObserver;

public class HeatingSystem {

  private final int MIN_TEMPERATURE = -10; // threshold
  private boolean heatingOn;

  public void changeTemperature(int newTemperature){
    if (newTemperature < MIN_TEMPERATURE && !heatingOn) {
      activateHeating();
    } else if (newTemperature >= MIN_TEMPERATURE && heatingOn) {
      deactivateHeating();
    }
  }

  private void activateHeating() {
    heatingOn = true;
    System.out.println(this.getClass().getSimpleName() + " activated.");
  }

  private void deactivateHeating(){
    heatingOn = false;
    System.out.println(this.getClass().getSimpleName() + " deactivated.");
  }
}
