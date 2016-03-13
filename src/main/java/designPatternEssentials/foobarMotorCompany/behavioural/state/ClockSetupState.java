package main.designPatternEssentials.foobarMotorCompany.behavioural.state;

public interface ClockSetupState {
  void previousValue();
  void nextValue();
  void selectValue();

  String getInstructions();
  int getSelectedValue();

}