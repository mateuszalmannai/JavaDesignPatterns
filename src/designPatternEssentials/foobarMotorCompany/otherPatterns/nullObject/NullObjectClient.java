package designPatternEssentials.foobarMotorCompany.otherPatterns.nullObject;

public class NullObjectClient {
  public static void main(String[] args) {
    WarningLight[] lights = new WarningLight[3];
    lights[0] = new OilLevelLight();
    lights[1] = new BrakeFluidLight();
    lights[2] = new NullObjectLight(); // empty slot

    // No need to test for null
    for (WarningLight light : lights) {
      light.turnOn();
      light.turnOff();
      System.out.println(light.getClass().getSimpleName() + ": " + light.isOn());
    }
  }
}
