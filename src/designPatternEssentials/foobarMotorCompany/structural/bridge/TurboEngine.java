package designPatternEssentials.foobarMotorCompany.structural.bridge;

public class TurboEngine extends AbstractEngine {
  public TurboEngine(int size) {
    super(size, true); // turbocharged
  }
}
