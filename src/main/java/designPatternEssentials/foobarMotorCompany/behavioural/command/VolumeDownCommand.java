package main.designPatternEssentials.foobarMotorCompany.behavioural.command;

public class VolumeDownCommand implements Command {

  private Radio radio;

  public VolumeDownCommand(Radio radio) {
    this.radio = radio;
  }

  @Override
  public void execute() {
    radio.volumeDown();
  }

  @Override
  public void undo() {
    radio.volumeDown();
  }
}
