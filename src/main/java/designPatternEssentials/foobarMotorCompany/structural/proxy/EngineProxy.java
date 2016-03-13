package main.designPatternEssentials.foobarMotorCompany.structural.proxy;

import main.designPatternEssentials.foobarMotorCompany.structural.flyweight.DiagnosticTool;
import main.designPatternEssentials.foobarMotorCompany.structural.flyweight.Engine;
import main.designPatternEssentials.foobarMotorCompany.structural.flyweight.StandardEngine;
import main.designPatternEssentials.foobarMotorCompany.structural.flyweight.TurboEngine;

/**
 * The constructor creates either a StandardEngine or TurboEngine object and stores
 * a reference to it as an instance variable.
 * Calls to getSize() and isTurbo() simply forward to the referenced engine object.
 * Calls to diagnose() will invoke a separate thread to run the actual diagnosis; this can
 * be useful if you cannot modify the original source code for some reason.
 */
public class EngineProxy implements Engine{
  private Engine engine;


  public EngineProxy(int size, boolean turbo) {
    if (turbo) {
      engine = new TurboEngine(size);
    } else {
      engine = new StandardEngine(size);
    }
  }

  @Override
  public int getSize() {
    return engine.getSize();
  }

  @Override
  public boolean isTurbo() {
    return engine.isTurbo();
  }

  // This method is time-consuming
  @Override
  public void diagnose(final DiagnosticTool tool) {
    // Run the method as a separate thread
    final Thread thread = new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("(Running tool as thread)");
        engine.diagnose(tool);
      }
    });
    thread.start();
    System.out.println("EngineProxy diagnose() method finished");
  }
}
