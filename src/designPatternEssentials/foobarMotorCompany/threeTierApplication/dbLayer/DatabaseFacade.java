package designPatternEssentials.foobarMotorCompany.threeTierApplication.dbLayer;

import java.io.IOException;

/**
 * In order to simplify the job of any package that needs to make use of the
 * database (which will be the business package in our case) there will be
 * only a single point of access to all database functionality. This will
 * provide a high-level view of the database which hides the internal structure
 * and so also promotes loose coupling.
 * The Facade pattern used in conjunction with the Singleton pattern provides
 * a means of defining a single point of access.
 *
 * The class is a Singleton, since the calling package should only use one
 * Facade object.
 * The class holds the EntityTable object to store the engines/vehicles and methods to
 * get all or one of them, as well as adding a new engine/vehicle.
 * Ther serialization persistence strategy is assumed, but its easy to see how
 * alternative strategies could be used.
 * Methods to add and remove listeners and to save and restore the data are
 * delegated to the appropriate objects.
 *
 * The business tier communicates only through the DatabaseFacade object, which has
 * the effect of hiding the dbLayer package's complexity behind the facade.
 */
public enum DatabaseFacade {
  INSTANCE;

  private EntityTable engines;
  private EntityTable vehicles;

  private AbstractEntityPersistenceStrategy persistenceStrategy;

  DatabaseFacade() {
    engines = new EntityTable(EntityKeyGenerator.ENGINE);
    vehicles= new EntityTable(EntityKeyGenerator.VEHICLE);

    // Set which persistence strategy to use
    // (maybe get from configuration settings somewhere)

    persistenceStrategy = new EntitySerializationStrategy();
  }

  public Object[] getAllEngines() {
    return engines.getAll().toArray();
  }

  public Object[] getAllVehicles() {
    return vehicles.getAll().toArray();
  }

  public Object getEngine(Integer key) {
    return engines.getByKey(key);
  }

  public Object getVehicle(Integer key) {
    return vehicles.getByKey(key);
  }

  public Integer addEngine(Object engine) {
    return engines.addEntity(engine);
  }

  public Integer addVehicle(Object vehicle) {
    return vehicles.addEntity(vehicle);
  }

  public void addEngineListener(EntityListener listener) {
    engines.addEntityListener(listener);
  }

  public void addVehicleListener(EntityListener listener) {
    vehicles.addEntityListener(listener);
  }

  public void removeEngineListener(EntityListener listener) {
    engines.removeEntityListener(listener);
  }

  public void removeVehicleListener(EntityListener listener) {
    vehicles.removeEntityListener(listener);
  }

  public void saveEngines() throws IOException {
    persistenceStrategy.save(engines);
  }

  public void saveVehicles() throws IOException{
    persistenceStrategy.save(vehicles);
  }

  public void restoreEngines() throws IOException {
    EntityTable restoredEngines = persistenceStrategy.restore(engines);
    engines.restore(restoredEngines);
  }

  public void restoreVehicles() throws IOException {
    EntityTable restoredVehicles = persistenceStrategy.restore(vehicles);
    vehicles.restore(restoredVehicles);
  }

}
