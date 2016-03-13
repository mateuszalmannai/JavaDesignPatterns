package main.designPatternEssentials.foobarMotorCompany.structural.adapter;

import main.designPatternEssentials.foobarMotorCompany.common.Engine;
import main.designPatternEssentials.foobarMotorCompany.common.StandardEngine;
import main.designPatternEssentials.foobarMotorCompany.common.TurboEngine;

import java.util.ArrayList;

public class AdapterClient {

  public static void main(String[] args) {
    ArrayList<Engine> engines = new ArrayList<Engine>();

    engines.add(new StandardEngine(1300));
    engines.add(new StandardEngine(1600));
    engines.add(new TurboEngine(2000));

    // "Adapt" the new engine type...
    SuperGreenEngine greenEngine = new SuperGreenEngine(1200);
    engines.add(new SuperGreenEngineAdapter(greenEngine));

    for (Engine engine : engines) {
      System.out.println(engine);
    }
  }
}
