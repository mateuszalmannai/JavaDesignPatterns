package designPatternEssentials.foobarMotorCompany.behavioural.mediator;

public class MediatorClient {
  public static void main(String[] args) {
    EngineManagementSystem mediator = new EngineManagementSystem();
    Ignition ignition = new Ignition(mediator);
    Gearbox gearbox = new Gearbox(mediator);
    Brake brake = new Brake(mediator);
    Accelerator accelerator = new Accelerator(mediator);

    mediator.registerIgnition(ignition);
    mediator.registerGearbox(gearbox);
    mediator.registerBrake(brake);
    mediator.registerAccelerator(accelerator);

    ignition.start();
    accelerator.accelerateToSpeed(60);
    brake.apply();
    System.out.println(accelerator.getSpeed());
  }
}
