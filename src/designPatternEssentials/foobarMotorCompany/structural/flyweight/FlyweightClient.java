package designPatternEssentials.foobarMotorCompany.structural.flyweight;

public class FlyweightClient {
  public static void main(String[] args) {
    final EngineFlyweightFactory factory = new EngineFlyweightFactory();

    // Create the diagnostic tool
    final EngineDiagnosticTool tool = new EngineDiagnosticTool();

    // Get the flyweights and run diagnostics on them
    final Engine standard1 = factory.getStandardEngine(1300);
    standard1.diagnose(tool);
    final Engine standard2 = factory.getStandardEngine(1300);
    standard2.diagnose(tool);
    final Engine standard3 = factory.getStandardEngine(1300);
    standard3.diagnose(tool);
    final Engine standard4 = factory.getStandardEngine(1600);
    standard4.diagnose(tool);
    final Engine standard5 = factory.getStandardEngine(1600);
    standard5.diagnose(tool);

    // Show that objects are shared
    System.out.println(standard1.hashCode());
    System.out.println(standard2.hashCode());
    System.out.println(standard3.hashCode());
    System.out.println(standard4.hashCode());
    System.out.println(standard5.hashCode());

    /**
     * In the above, the variables standard1, standard2 and standard3 all reference
     * the same Engine object since they're all 1300cc standard engines.
     * Likewise, standard4 references the same object as standard5.
     *
     * If the arguments passed to the extrinsic method (the DiagnosticTool in this
     * example) need to be stored, this should be done in the client program.
     */

  }
}
