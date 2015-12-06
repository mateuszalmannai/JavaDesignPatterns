package designPatternEssentials.foobarMotorCompany.threeTierApplication.dbLayer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Simple class that can store a Map of objects keyed
 * by a numeric id
 *
 * The entities are stored in a Map keyd by an Integer (to
 * represent the primary key) and where the value will be
 * an Object. This allows the class to store any object
 * type and therefore promotes loose coupling.
 *
 * Methods are provided to return all entities or just one
 * if the key is provided.
 *
 * Methods are provided to add and remove EntityListener
 * objects. This will enable other classes to be notified
 * whenever a new entity is added to the database (or the
 * data is restored), and is an example of the Observer
 * pattern in action.
 *
 * The constructor and methods use package-private access to
 * help enforce that external packages only go through the
 * facade method objects, which are public.
 */
public class EntityTable implements Serializable {
  private EntityKeyGenerator keyGenerator;
  private Map<Integer, Object> entities;
  private Collection<EntityListener> listeners;

  /**
   * The constructor requires an EntityKeyGenerator object
   * which it can use to generate the next key for this
   * particular entity type
   * @param keyGenerator
   */
  EntityTable(EntityKeyGenerator keyGenerator) {
    this.keyGenerator = keyGenerator;
    entities = new HashMap<Integer, Object>();
    listeners = new ArrayList<EntityListener>();
  }

  Object getByKey(Integer key) {
    return entities.get(key);
  }

  Collection<Object> getAll() {
    return entities.values();
  }

  /**
   * Method to generate and return the next primary key
   * after adding the entity to the Map
   * @param value
   * @return key
   */
  Integer addEntity(Object value) {
    Integer key = keyGenerator.getNextKey();
    entities.put(key, value);
    fireEntityAdded(key, value);
    return key;
  }

  /**
   * Method to replace the data with that provided in
   * the argument
   * @param restoredTable
   */
  void restore(EntityTable restoredTable) {
    entities.clear();
    entities.putAll(restoredTable.entities);
    fireEntityRestored();
  }

  void addEntityListener(EntityListener listener) {
    listeners.add(listener);
  }

  void removeEntityListener(EntityListener listener) {
    listeners.remove(listener);
  }

  private void fireEntityAdded(Integer key, Object value) {
    EntityEvent event = new EntityEvent(key, value);
    for (EntityListener listener : listeners) {
      listener.entityAdded(event);
    }
  }

  private void fireEntityRestored() {
    EntityEvent event = new EntityEvent();
    for (EntityListener listener : listeners) {
      listener.entityRestored(event);
    }
  }
}
