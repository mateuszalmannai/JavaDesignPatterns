package main.designPatternEssentials.foobarMotorCompany.behavioural.command;

public class SpeechRecogniser {

  private Command upCommand, downCommand;

  public void setCommands(Command upCommand, Command downCommand) {
    this.upCommand = upCommand;
    this.downCommand = downCommand;
  }

  public void hearUpSpoken() {
    upCommand.execute();
  }

  public void hearDownSpoken() {
    downCommand.execute();
  }
}
