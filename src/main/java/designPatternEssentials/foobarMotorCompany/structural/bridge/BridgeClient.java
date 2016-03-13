package main.designPatternEssentials.foobarMotorCompany.structural.bridge;

public class BridgeClient {

  public static void main(String[] args) {
    StandardEngine engine = new StandardEngine(1300);

    System.out.println("Using standard controls:");
    StandardControls standardControls = new StandardControls(engine);
    standardControls.ignitionOn();
    standardControls.accelarate();
    standardControls.brake();
    standardControls.ignitionOff();

    // Now using sport controls
    System.out.println();
    System.out.println("Using sport controls:");
    SportControls sportControls = new SportControls(engine);
    sportControls.ignitionOn();
    sportControls.accelarate();
    sportControls.accelerateHard();
    sportControls.brake();
    sportControls.ignitionOff();

  }
}
