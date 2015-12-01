package designPatternEssentials.foobarMotorCompany.structural.visitor;


public class StandardEngine extends AbstractEngine {
  public StandardEngine(int size) {
    super(size, false); // not turbocharged
  }
}
