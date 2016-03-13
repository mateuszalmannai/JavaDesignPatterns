package main.designPatternEssentials.foobarMotorCompany.structural.bridge;

/**
 * Within the vehicle, the driver controls the functions of the engine indirectly by means of
 * various hand and foot controls, such as, the ignition switch, accelerator and break pedals.
 * To retain flexibility, it is important to design the connection between the engine and the
 * controls so that each can vary independently of the other.
 */
public abstract class AbstractEngine implements Engine {
  private int size;
  private boolean turbo;
  private boolean running;
  private int power;

  public AbstractEngine(int size, boolean turbo) {
    this.size = size;
    this.turbo = turbo;
    running = false;
    power = 0;
  }

  @Override
  public int getSize() {
    return size;
  }

  @Override
  public boolean isTurbo() {
    return turbo;
  }

  @Override
  public void start() {
    running = true;
    System.out.println("Engine started");
  }

  @Override
  public void stop() {
    running = false;
    power = 0;
    System.out.println("Engine stopped");
  }

  @Override
  public void increasePower() {
    if (running && (power < 10)) {
      power++;
      System.out.println("Engine power increased to " + power);
    }
  }

  @Override
  public void decreasePower() {
    if (running && (power > 0)) {
      power--;
      System.out.println("Engine power decreased to " + power);
    }
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + " (" + size + ")";
  }
}
