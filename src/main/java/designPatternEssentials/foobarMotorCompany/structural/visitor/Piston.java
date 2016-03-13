package main.designPatternEssentials.foobarMotorCompany.structural.visitor;

public class Piston implements Visitable{
  @Override
  public void acceptEngineVisitor(EngineVisitor visitor) {
    visitor.visit(this);
  }
}
