package main.behavioral.command.balzholczer.standard;

import java.util.ArrayList;
import java.util.List;

/**
 * Invoker
 */
public class Switcher {
   private List<Command> commandList;

  public Switcher() {
    commandList = new ArrayList<>();
  }

  public void addCommand(Command command) {
    commandList.add(command);
  }

  public void executeCommands() {
    for (Command command : commandList) {
      command.execute();
    }
  }
}
