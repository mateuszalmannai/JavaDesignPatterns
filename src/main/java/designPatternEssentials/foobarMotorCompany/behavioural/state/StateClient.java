package main.designPatternEssentials.foobarMotorCompany.behavioural.state;

import java.util.Calendar;

public class StateClient {
  public static void main(String[] args) {

    ClockSetup clockSetup = new ClockSetup();

    System.out.println(clockSetup.getYearState().getSelectedValue() + " "
      + clockSetup.getMonthSetupState().getSelectedValue() + " "
      + clockSetup.getDaySetupState().getSelectedValue() + " " + clockSetup.getHourSetupState().getSelectedValue() + " "
      + clockSetup.getMinuteSetupState().getSelectedValue());

    System.out.println("Calendar months go from one to 13, December: " +  Calendar.getInstance().get(Calendar.DECEMBER));

    // Setup starts in 'year' state
    clockSetup.rotateKnobRight();
    clockSetup.pushKnob();      // one year on

    // Setup should now be in 'month' state
    clockSetup.rotateKnobRight();
    clockSetup.rotateKnobRight();
    clockSetup.pushKnob();     // two months on

    // Setup should now be in 'day' state
    clockSetup.rotateKnobRight();
    clockSetup.rotateKnobRight();
    clockSetup.rotateKnobRight();
    clockSetup.pushKnob();     // three days on

    // Setup should now be in 'hour' state
    clockSetup.rotateKnobLeft();
    clockSetup.rotateKnobLeft();
    clockSetup.pushKnob();     // two hours back

    // Setup should now be in 'minute' state
    clockSetup.rotateKnobRight();
    clockSetup.pushKnob();     // one minute on

    // Setup should now be in 'finished' state
    clockSetup.pushKnob();     // display selected date
  }

}
