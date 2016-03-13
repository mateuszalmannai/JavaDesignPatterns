package main.designPatternEssentials.foobarMotorCompany.threeTierApplication.dbLayer;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.IOException;

/**
 * Class could be coded to use a CSV formatted file, however
 * code omitted here.
 *
 * Methods are package-private to help enforce that external packages only go through
 * the facade object methods, which are public.
 */
public class EntityCSVStrategy extends AbstractEntityPersistenceStrategy{
  @Override
  String getFileSuffix() {
    return ".csv";
  }

  @Override
  void save(EntityTable table) throws IOException {
    // code to save table data in CSV format (omitted)
  }

  @Override
  EntityTable restore(EntityTable table) throws IOException, NotImplementedException {
    // code to restore table data from CSV format (omitted)
    throw new NotImplementedException();
  }

}
