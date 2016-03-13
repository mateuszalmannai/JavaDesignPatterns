package main.designPatternEssentials.foobarMotorCompany.structural.adapter;

/**
 * This class is made by a different manufacturer, i.e. a third party and does not implement the Engine interface.
 * Furthermore, Foobar do not have access to the Java source code and can therefore not modify it.
 * These types of engines are never turbocharged.
 */
public class SuperGreenEngine {


  private int engineSize;

  public SuperGreenEngine(int engineSize) {
    this.engineSize = engineSize;
  }

  public int getEngineSize() {
    return engineSize;
  }

  @Override
  public String toString() {
    return "SUPER ENGINE " +  engineSize;
  }
}
