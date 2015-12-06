package designPatternEssentials.foobarMotorCompany.threeTierApplication.businessLayer;


public class StandardEngine extends AbstractEngine{
  public StandardEngine(int size) {
    super(size, false); // not turbocharged
  }
}
