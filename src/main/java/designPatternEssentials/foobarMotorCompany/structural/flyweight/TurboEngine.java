package main.designPatternEssentials.foobarMotorCompany.structural.flyweight;


public class TurboEngine extends AbstractEngine {
  public TurboEngine(int size) {
    super(size, true); // turbocharged
  }
}
