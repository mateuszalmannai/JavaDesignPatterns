package main.designPatternEssentials.foobarMotorCompany.threeTierApplication.businessLayer;


/**
 * Note how the create() method is static and overloaded so that
 * client objects can either supply the enum Type value or a boolean.
 */
public class EngineFactory {
  public enum Type {STANDARD, TURBO}

  static Engine create(EngineFactory.Type type, int size) {
    if (type == Type.STANDARD) {
      return new StandardEngine(size);
    } else {
      return new TurboEngine(size);
    }
  }

  static Engine create(int size, boolean turbo) {
    return EngineFactory.create(turbo ? Type.TURBO : Type.STANDARD, size);
  }

  private EngineFactory() {}
}
