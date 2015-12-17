package designPatternEssentials.foobarMotorCompany.behavioural.state;

import java.util.Calendar;

public class MonthSetupState implements ClockSetupState {
  private ClockSetup clockSetup;
  private int month;


  public MonthSetupState(ClockSetup clockSetup) {
    this.clockSetup = clockSetup;
    month = Calendar.getInstance().get(Calendar.MONTH);
  }

  @Override
  public void previousValue() {
    if (month > 0) {
      month --;
    }
  }

  @Override
  public void nextValue() {
    if (month < 11) {
      month++;
    }
  }

  @Override
  public void selectValue() {
    System.out.println("Month set to " + month + 1);
    clockSetup.setState(clockSetup.getDaySetupState());
  }

  @Override
  public String getInstructions() {
    return "Please set the month...";
  }

  @Override
  public int getSelectedValue() {
    return month;
  }
}
