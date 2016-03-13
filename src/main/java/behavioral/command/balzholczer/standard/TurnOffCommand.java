package main.behavioral.command.balzholczer.standard;

public class TurnOffCommand implements Command{

  private Light light;

  /**
   * Dependency Injection: We depend on an instance of Light
   */
  public TurnOffCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.turnOff();
  }
}
