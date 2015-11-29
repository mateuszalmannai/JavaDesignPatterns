package designPatternEssentials.foobarMotorCompany.behavioural.state;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 'Context' class ClockSetup holds references to each state and
 * forwards to whichever is the current state
 */
public class ClockSetup {

  // The various states the setup can be in...
  private ClockSetupState yearState;
  private ClockSetupState monthState;
  private ClockSetupState dayState;
  private ClockSetupState hourState;
  private ClockSetupState minuteState;
  private ClockSetupState finishedState;

  // The current state we are in...
  private ClockSetupState currentState;

  public ClockSetup() {
    yearState = new YearSetupState(this);
    monthState = new MonthSetupState(this);
    dayState = new DaySetupState(this);
    hourState = new HourSetupState(this);
    minuteState = new MinuteSetupState(this);
    finishedState = new FinishedSetupState(this);

    // Initial state to set the year
    setState(getYearState());
  }

  public void setState(ClockSetupState state) {
    currentState = state;
    System.out.println(currentState.getInstructions());
  }

  public void rotateKnobLeft() {
    currentState.previousValue();
  }

  public void rotateKnobRight() {
    currentState.nextValue();
  }

  public void pushKnob() {
    currentState.selectValue();
  }

  public ClockSetupState getYearState() {
    return yearState;
  }

  public ClockSetupState getMonthSetupState() {
    return monthState;
  }

  public ClockSetupState getDaySetupState() {
    return dayState;
  }

  public ClockSetupState getHourSetupState() {
    return hourState;
  }

  public ClockSetupState getMinuteSetupState() {
    return minuteState;
  }

  public ClockSetupState getFinishedSetupState() {
    return finishedState;
  }

  public Calendar getSelectedDate() {

    return new GregorianCalendar(yearState.getSelectedValue(), monthState.getSelectedValue(),
      dayState.getSelectedValue(), hourState.getSelectedValue(), minuteState.getSelectedValue());
  }
}
