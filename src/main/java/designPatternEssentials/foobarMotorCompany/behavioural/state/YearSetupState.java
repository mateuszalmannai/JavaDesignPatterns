package main.designPatternEssentials.foobarMotorCompany.behavioural.state;

import java.util.Calendar;

/**
 * Looking at YearSetupState, you will notice that it takes a reference to a
 * ClockSetup object in the constructor, which is known in the language of
 * design patterns as its 'context'
 *
 * Not in particular how YearSetupState transitions internally to a different
 * state in the selectValue() method.
 */
public class YearSetupState implements ClockSetupState {

  private ClockSetup clockSetup;
  private int year;


  public YearSetupState(ClockSetup clockSetup) {
    this.clockSetup = clockSetup;
    year = Calendar.getInstance().get(Calendar.YEAR);
  }

  @Override
  public void previousValue() {
    year--;
  }

  @Override
  public void nextValue() {
    year++;
  }

  @Override
  public void selectValue() {
    System.out.println("Year set to " + year);
    clockSetup.setState(clockSetup.getMonthSetupState());
  }

  @Override
  public String getInstructions() {
    return "Please set the year...";
  }

  @Override
  public int getSelectedValue() {
    return year;
  }
}
