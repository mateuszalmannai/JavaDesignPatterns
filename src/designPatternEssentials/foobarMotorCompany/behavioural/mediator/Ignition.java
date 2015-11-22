package designPatternEssentials.foobarMotorCompany.behavioural.mediator;

public class Ignition {
  private EngineManagementSystem mediator;
  private boolean on;


  public Ignition(EngineManagementSystem mediator) {
    this.mediator = mediator;
    on = false;

    // Register back with the mediator
    mediator.registerIgnition(this);
  }

  public void start(){
    on = true;
    mediator.ignitionTurnedOn();
    System.out.println("Ignition turned on");
  }

  public void stop(){
    on = false;
    mediator.ingitionTurnedOff();
    System.out.println("Ignition turned off");
  }

  public boolean isOn() {
    return on;
  }

}
