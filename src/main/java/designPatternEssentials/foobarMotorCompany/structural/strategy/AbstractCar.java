package main.designPatternEssentials.foobarMotorCompany.structural.strategy;

import main.designPatternEssentials.foobarMotorCompany.common.AbstractVehicle;
import main.designPatternEssentials.foobarMotorCompany.common.Engine;

/**
 * The AbstractCar class is defined to hold a reference to the interface type
 * (i.e. GearboxStrategy) and provide accessor methods so different strategies
 * can be switched. There is also a setSpeed() method that delegates to
 * whatever strategy is in effect.
 */
public abstract class AbstractCar extends AbstractVehicle {
  private GearboxStrategy gearboxStrategy;

  public AbstractCar(Engine engine) {
    this(engine, Colour.UNPAINTED);
  }

  public AbstractCar(Engine engine, Colour colour) {
    super(engine, colour);

    // Starts in standard gearbox mode (more economical)
    gearboxStrategy = new StandardGearboxStrategy();

  }

  // Allow the gearbox strategy to be changed...
  public void setGearboxStrategy(GearboxStrategy gearboxStrategy) {
    this.gearboxStrategy = gearboxStrategy;
  }

  public GearboxStrategy getGearboxStrategy() {
    return gearboxStrategy;
  }

  public void setSpeed(int speed) {
    // Delegate to strategy in effect...
    gearboxStrategy.ensureCorrectGear(getEngine(), speed);
  }
}
