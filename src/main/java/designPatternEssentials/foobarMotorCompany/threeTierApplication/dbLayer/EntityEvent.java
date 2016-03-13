package main.designPatternEssentials.foobarMotorCompany.threeTierApplication.dbLayer;

import java.util.EventObject;

/**
 * Class to store a reference to the key and value of
 * the entity object
 */
public class EntityEvent extends EventObject{
  private Object value;

  EntityEvent() {
    this(0, null); // used when restoring data
  }

  EntityEvent(Integer key, Object value) {
    super(key);
    this.value = value;
  }

  public Integer getKey() {
    return (Integer) getSource();
  }

  public Object getValue() {
    return value;
  }
}
