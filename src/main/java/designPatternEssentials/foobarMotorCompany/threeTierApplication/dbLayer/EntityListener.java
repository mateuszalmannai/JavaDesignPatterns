package main.designPatternEssentials.foobarMotorCompany.threeTierApplication.dbLayer;

import java.util.EventListener;

/**
 * Interface that declares methods indicating that a
 * new entity was added to the database, or that the
 * data was restored
 */
public interface EntityListener extends EventListener{
  void entityAdded(EntityEvent event);
  void entityRestored(EntityEvent event);
}
