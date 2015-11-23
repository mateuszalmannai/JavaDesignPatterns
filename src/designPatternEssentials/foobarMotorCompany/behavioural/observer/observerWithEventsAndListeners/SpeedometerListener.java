package designPatternEssentials.foobarMotorCompany.behavioural.observer.observerWithEventsAndListeners;

import java.util.EventListener;

/**
 * Going hand-in-hand with SpeedometerEvent is an interface
 * which extends the java.util.EventListener interface.
 *
 * All classes that implement SpeedometerListener will need to
 * provide code for the speedChanged() method. They can get
 * any required data through the SpeedometerEvent passed in the
 * argument.
 * It is common to have several methods that each notify a
 * different piece of state that has changed.
 */
public interface SpeedometerListener extends EventListener {
  void speedChanged(SpeedometerEvent event);
}
