package designPatternEssentials.foobarMotorCompany.threeTierApplication.dbLayer;

import java.io.*;

/**
 * Note the way the InputStream and OutputStream objects are wrapped together in the
 * save() and restore() methods. For example, inside save(), a FileInputStream is
 * wrapped inside a BufferedOutputStream which is in turn wrapped inside an
 * ObjectOutputStream. This is an example of Java supplied classes following the
 * Decorator Pattern, where each OutputStream object provides additional functionality.
 *
 * Methods are package-private to help enforce that external packages only go through
 * the facade object methods, which are public.
 */
public class EntitySerializationStrategy extends AbstractEntityPersistenceStrategy {
  @Override
  String getFileSuffix() {
    return ".ser";
  }

  @Override
  void save(EntityTable table) throws IOException {
    File file = new File(getFileName(table) + getFileSuffix());
    FileOutputStream fileOutputStream = new FileOutputStream(file);
    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);
    objectOutputStream.writeObject(table);
    objectOutputStream.close();
  }

  @Override
  EntityTable restore(EntityTable table) throws IOException {
    File file = new File(getFileName(table) + getFileSuffix());
    FileInputStream fileInputStream = new FileInputStream(file);
    BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
    ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);
    try {
      table = (EntityTable) objectInputStream.readObject();
    } catch (ClassNotFoundException e) {
      throw new IOException(e);
    }
    objectInputStream.close();
    return table;
  }
}
