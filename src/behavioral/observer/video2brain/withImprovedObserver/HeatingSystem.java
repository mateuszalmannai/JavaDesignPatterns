package behavioral.observer.video2brain.withImprovedObserver;

public class HeatingSystem implements Observer<Integer> {

  private final int MIN_TEMPERATURE = -10; // threshold
  private boolean heatingOn;


  @Override
  public void changeValue(Integer newValue) {
    if (newValue < MIN_TEMPERATURE && !heatingOn) {
      activateHeating();
    } else if (newValue >= MIN_TEMPERATURE && heatingOn) {
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
