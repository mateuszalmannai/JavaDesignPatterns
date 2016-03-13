package main.designPatternEssentials.foobarMotorCompany.threeTierApplication.dbLayer;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.IOException;

/**
 * Saving the data to disk will be accomplished either by serialization or
 * by creating a CSV formatted text file. This suggests the Strategy pattern
 * so that either approach can be easily switched in.
 */
public abstract class AbstractEntityPersistenceStrategy {
  String getFileName(EntityTable table) {
    return table.getClass().getSimpleName();
  }

  abstract String getFileSuffix();
  abstract void save(EntityTable table) throws IOException;
  abstract EntityTable restore(EntityTable table) throws IOException, NotImplementedException;
}
