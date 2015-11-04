package designPatternEssentials.foobarMotorCompany.structural.flyweight;


public class StandardEngine extends AbstractEngine {
  public StandardEngine(int size) {
    super(size, false); // not turbocharged
  }
}
