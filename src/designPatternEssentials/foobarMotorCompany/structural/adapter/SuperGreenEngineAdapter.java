package designPatternEssentials.foobarMotorCompany.structural.adapter;

import designPatternEssentials.foobarMotorCompany.common.AbstractEngine;

/**
 * We extend the class we are adapting to.
 */
public class SuperGreenEngineAdapter extends AbstractEngine {

  /**
   * We accept a reference in the constructor to the class we are adapting from.
   *
   * The constructor obtains the necessary state from the referenced object and passes it to the
   * superclass constructor.
   */
  public SuperGreenEngineAdapter(SuperGreenEngine greenEngine) {
    super(greenEngine.getEngineSize(), false);
  }
}
