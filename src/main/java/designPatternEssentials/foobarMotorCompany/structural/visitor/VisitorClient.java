package main.designPatternEssentials.foobarMotorCompany.structural.visitor;


public class VisitorClient {
  public static void main(String[] args) {
    // Create an engine...
    Engine engine = new StandardEngine(1300);
    engine.acceptEngineVisitor(new EngineDiagnostics());

    // Run inventory on the engine
    engine.acceptEngineVisitor(new EngineInventory());
  }
}
