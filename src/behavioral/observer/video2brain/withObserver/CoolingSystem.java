package behavioral.observer.video2brain.withObserver;

public class CoolingSystem implements TemperatureObserver{

  private final int MAX_TEMPERATURE = 40; // threshold
  private boolean coolingOn;

  @Override
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
