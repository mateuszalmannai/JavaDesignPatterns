package designPatternEssentials.foobarMotorCompany.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * This class utilises two maps (one for standard engines and the other for
 * turbo engines).
 * Each time an engine of a particular type and size is requested,
 * if a similar one has already been created it is returned
 * rather than instantiating a new one.
 */
public class EngineFlyweightFactory {
  private Map<Integer, Engine> standardEnginePool;
  private Map<Integer, Engine> turboEnginePool;

  public EngineFlyweightFactory() {
    standardEnginePool = new HashMap<Integer, Engine>();
    turboEnginePool = new HashMap<Integer, Engine>();
  }

  public Engine getStandardEngine(int size) {
    Engine engine = standardEnginePool.get(size);
    if (engine == null) {
      engine = new StandardEngine(size);
      standardEnginePool.put(size, engine);
    }
    return engine;
  }

  public Engine getTurboEngine(int size) {
    Engine engine = turboEnginePool.get(size);
    if (engine == null) {
      engine = new TurboEngine(size);
      turboEnginePool.put(size, engine);
    }
    return engine;
  }
}
