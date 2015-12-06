package designPatternEssentials.foobarMotorCompany.threeTierApplication.dbLayer;

/**
 * Singleton Pattern enum technique
 *
 * Multiton: enhanced to allow a separate series of numbers for vehicle
 * entities just by defining an extra enum constant for VEHICLE
 */
public enum EntityKeyGenerator {
  ENGINE, VEHICLE;

  private int nextKey;

  /**
   * To generate the next unique key for any Engine entity
   * the following method needs to be called
   * @return ++nextKey
   */
  synchronized int getNextKey() {
    return ++nextKey;
  }
}
