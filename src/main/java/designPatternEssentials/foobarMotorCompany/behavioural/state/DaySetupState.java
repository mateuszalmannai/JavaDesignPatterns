package main.designPatternEssentials.foobarMotorCompany.behavioural.state;

import java.util.Calendar;

public class DaySetupState implements ClockSetupState {
  private ClockSetup clockSetup;

  private int day;


  public DaySetupState(ClockSetup clockSetup) {
    this.clockSetup = clockSetup;
    day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
  }

  @Override
  public void previousValue() {
    if (day > 1) {
      day --;
    }
  }

  @Override
  public void nextValue() {
    if (day < Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH)) {
      day++;
    }
  }

  @Override
  public void selectValue() {
    System.out.println("Day set to " + day);
    clockSetup.setState(clockSetup.getHourSetupState());
  }

  @Override
  public String getInstructions() {
    return "Please set the day...";
  }

  @Override
  public int getSelectedValue() {
    return day;
  }
}
