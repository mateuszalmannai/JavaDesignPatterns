package main.designPatternEssentials.foobarMotorCompany.structural.visitor;

/**
 * The modified Engine interface also now defines the
 * acceptEngineVisitor() method
 */
public interface Engine extends Visitable {
  int getSize();
  boolean isTurbo();
}
