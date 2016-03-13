package main.behavioral.command.balzholczer.standard;

public class CommandClient {
  public static void main(String[] args) {
    Switcher switcher = new Switcher();
    Light light = new Light();
    Command turnOnCommand = new TurnOnCommand(light);
    Command turnOffCommand = new TurnOffCommand(light);
    switcher.addCommand(turnOnCommand);
    switcher.addCommand(turnOffCommand);
    switcher.executeCommands();
  }
}
