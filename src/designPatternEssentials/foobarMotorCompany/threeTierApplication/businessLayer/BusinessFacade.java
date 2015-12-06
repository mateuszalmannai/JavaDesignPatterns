package designPatternEssentials.foobarMotorCompany.threeTierApplication.businessLayer;

import designPatternEssentials.foobarMotorCompany.threeTierApplication.dbLayer.DatabaseFacade;
import designPatternEssentials.foobarMotorCompany.threeTierApplication.dbLayer.EntityListener;

import java.io.IOException;

/**
 * Just as was done for the dbLayer package, the business package will
 * have its own facade object. The UI tier communicates only through the
 * BusinessFacade object, which has the effect of hiding the business
 * package's complexity behind the facade.
 */
public enum BusinessFacade {
  INSTANCE;

  public Object[] getEngineTypes() {
    return EngineFactory.Type.values();
  }

  public Object[] getAllEngines(){
    return DatabaseFacade.INSTANCE.getAllEngines();
  }

  public Object addEngine(int size, Object type) {
    Engine engine = EngineFactory.create(size, type == EngineFactory.Type.TURBO);
    DatabaseFacade.INSTANCE.addEngine(engine);
    return engine;
  }

  public void saveEngines() throws IOException{
    DatabaseFacade.INSTANCE.saveEngines();
  }

  public void restoreEngines() throws IOException{
    DatabaseFacade.INSTANCE.restoreEngines();
  }

  public void addEngineListener(EntityListener listener) {
    DatabaseFacade.INSTANCE.addEngineListener(listener);
  }

  public void removeEngineListener(EntityListener listener) {
    DatabaseFacade.INSTANCE.removeEngineListener(listener);
  }

}
