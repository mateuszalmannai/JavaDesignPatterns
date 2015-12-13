package behavioral.command.balzholczer.standard;

public class TurnOnCommand implements Command {

  private Light light;

  /**
   * Dependency Incjection: We depend on an instance of Light
   */
  public TurnOnCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.turnOn();
  }
}
