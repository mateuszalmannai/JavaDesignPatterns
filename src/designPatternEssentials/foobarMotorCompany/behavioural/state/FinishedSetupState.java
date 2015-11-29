package designPatternEssentials.foobarMotorCompany.behavioural.state;

import java.util.Calendar;

public class FinishedSetupState implements ClockSetupState {
  private ClockSetup clockSetup;

  public FinishedSetupState(ClockSetup clockSetup) {
    this.clockSetup = clockSetup;
  }

  @Override
  public void previousValue() {
    System.out.println("Ignored...");
  }

  @Override
  public void nextValue() {
    System.out.println("Ignored...");
  }

  @Override
  public void selectValue() {
    Calendar selectedDate = clockSetup.getSelectedDate();
    System.out.println("Date set to: " + selectedDate.getTime());
  }

  @Override
  public String getInstructions() {
    return "Press know to view selected date...";
  }

  @Override
  public int getSelectedValue() {
    throw new UnsupportedOperationException("Clock setup finished");
  }
}
