package main.designPatternEssentials.foobarMotorCompany.structural.flyweight;

public class EngineDiagnosticTool implements DiagnosticTool {

  @Override
  public void runDiagnosis(Object object) {
    System.out.println("Starting engine diagnostic tool for " + object);

    try {
      // To simulate a long-running process the method pauses for five seconds
      Thread.sleep(5000);
      System.out.println("Engine diagnosis complete");
    } catch (InterruptedException ex) {
      System.out.println("Engine diagnosis interrupted");
    }
  }
}
