package main.behavioral.observer.video2brain.withObserver;

public class HeatingSystem implements TemperatureObserver{

  private final int MIN_TEMPERATURE = -10; // threshold
  private boolean heatingOn;

  @Override
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
