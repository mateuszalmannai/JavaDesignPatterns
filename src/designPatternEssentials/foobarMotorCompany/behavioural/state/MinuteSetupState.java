package designPatternEssentials.foobarMotorCompany.behavioural.state;

import java.util.Calendar;

public class MinuteSetupState implements ClockSetupState {
  private ClockSetup clockSetup;
  private int minute;

  public MinuteSetupState(ClockSetup clockSetup) {
    this.clockSetup = clockSetup;
    minute = Calendar.getInstance().get(Calendar.MINUTE);
  }

  @Override
  public void previousValue() {
    if (minute > 0) {
      minute--;
    }
  }

  @Override
  public void nextValue() {
    if (minute < 59) {
      minute++;
    }
  }

  @Override
  public void selectValue() {
    System.out.println("Minute set to " + minute);
    clockSetup.setState(clockSetup.getFinishedSetupState());
  }

  @Override
  public String getInstructions() {
    return "Please set the minute...";
  }

  @Override
  public int getSelectedValue() {
    return minute;
  }
}
