package designPatternEssentials.foobarMotorCompany.otherPatterns.simpleFactory;

/**
 * The create() method takes care of the selection and instantiation, and thus
 * isolates each client program from repeating code.
 * The method is static purely for convenience; it is not a requirement of the 'pattern'
 */
public class GearboxFactory {
  public enum Type {AUTOMATIC, MANUAL}

  public static Gearbox create(Type type) {
    Gearbox gearbox;
    if (type == Type.AUTOMATIC) {
      gearbox = new AutomaticGearbox();
    } else {
      gearbox = new ManualGearbox();
    }
    return gearbox;
  }
}
