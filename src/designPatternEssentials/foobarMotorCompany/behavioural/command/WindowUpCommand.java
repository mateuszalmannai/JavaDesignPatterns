package designPatternEssentials.foobarMotorCompany.behavioural.command;

public class WindowUpCommand implements Command {

  private ElectricWindow window;

  public WindowUpCommand(ElectricWindow window) {
    this.window = window;
  }

  @Override
  public void execute() {
    window.closeWindow();
  }

  @Override
  public void undo() {
    window.openWindow();
  }
}
