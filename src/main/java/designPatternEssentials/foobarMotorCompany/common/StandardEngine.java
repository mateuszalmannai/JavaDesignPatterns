package main.designPatternEssentials.foobarMotorCompany.common;

public class StandardEngine extends AbstractEngine{
  public StandardEngine(int size) {
    super(size, false); // not turbocharged
  }
}
