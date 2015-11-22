package designPatternEssentials.foobarMotorCompany.behavioural.mediator;

public class EngineManagementSystem {
  private Ignition ignition;
  private Gearbox gearbox;
  private Accelerator accelerator;
  private Brake brake;
  private int currentSpeed;

  public EngineManagementSystem() {
    currentSpeed = 0;
  }

  // Methods that enable registration with this mediator...

  public void registerIgnition(Ignition ignition) {
    this.ignition = ignition;
  }

  public void registerGearbox(Gearbox gearbox) {
    this.gearbox = gearbox;
  }

  public void registerAccelerator(Accelerator accelerator) {
    this.accelerator = accelerator;
  }

  public void registerBrake(Brake brake) {
    this.brake = brake;
  }

  // Methods that handle interactions...

  public void ignitionTurnedOn() {
    gearbox.enable();
    accelerator.enable();
    brake.enable();
  }

  public void ingitionTurnedOff() {
    gearbox.disable();
    accelerator.disable();
    brake.disable();
  }

  public void gearboxEnabled() {
    System.out.println("EMS now controlling the gearbox");
  }

  public void gearboxDisabled() {
    System.out.println("EMS no longer controlling the gearbox");
  }

  public void gearChanged() {
    System.out.println("EMS disengaging revs while changing gear");
  }

  public void acceleratorEnabled() {
    System.out.println("EMS controlling the accelerator");
  }

  public void acceleratorDisabled() {
    System.out.println("EMS no longer controlling the accelerator");
  }

  public void acceleratorPressed() {
    brake.disable();
    while (currentSpeed < accelerator.getSpeed()) {
      currentSpeed++;
      System.out.println("Speed currently " + currentSpeed);

      // Set gear according to speed...
      if (currentSpeed <= 10) {
        gearbox.setGear(Gearbox.Gear.FIRST);
      } else if (currentSpeed <= 20) {
        gearbox.setGear(Gearbox.Gear.SECOND);
      } else if (currentSpeed <= 30) {
        gearbox.setGear(Gearbox.Gear.THIRD);
      } else if (currentSpeed <= 50) {
        gearbox.setGear(Gearbox.Gear.FOURTH);
      } else {
        gearbox.setGear(Gearbox.Gear.FIFTH);
      }
    }
    brake.enable();
  }

  public void brakeEnabled() {
    System.out.println("EMS now controlling the brakes");
  }

  public void brakeDisabled() {
    System.out.println("EMS no longer controlling the brakes");
  }

  public void brakePressed() {
    accelerator.disable();

    currentSpeed = 0;
  }

  public void brakeReleased() {
    accelerator.enable();
    gearbox.setGear(Gearbox.Gear.FIRST);
  }
}
