package main.designPatternEssentials.foobarMotorCompany.behavioural.mediator;

public class Brake {
  private EngineManagementSystem mediator;
  private boolean enabled;
  private boolean applied;


  public Brake(EngineManagementSystem mediator) {
    this.mediator = mediator;
    enabled = false;
    applied = false;
    mediator.registerBrake(this);
  }

  public void enable() {
    enabled = true;
    mediator.brakeEnabled();
    System.out.println("Brakes enabled");
  }

  public void disable(){
    enabled = false;
    mediator.brakeDisabled();
    System.out.println("Brakes disabled");
  }

  public boolean isEnabled() {
    return enabled;
  }

  public void apply(){
    if (isEnabled()) {
      applied = true;
      mediator.brakePressed();
      System.out.println("Now braking");
    }
  }

  public void release(){
    if (isEnabled()) {
      applied = false;
      mediator.brakeReleased();
      System.out.println("Brake released");
    }
  }
}
