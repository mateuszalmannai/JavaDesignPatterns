package designPatternEssentials.foobarMotorCompany.structural.bridge;

public class StandardEngine extends AbstractEngine {
  public StandardEngine(int size) {
    super(size, false); // not turbocharged
  }
}
