package behavioral.observer.video2brain.withImprovedObserver;

public class CoolingSystem implements Observer<Integer> {

  private final int MAX_TEMPERATURE = 40; // threshold
  private boolean coolingOn;

  @Override
  public void changeValue(Integer newValue){
    if (newValue > MAX_TEMPERATURE && !coolingOn) {
      activateCoolingSystem();
    } else if (newValue <= MAX_TEMPERATURE && coolingOn) {
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
