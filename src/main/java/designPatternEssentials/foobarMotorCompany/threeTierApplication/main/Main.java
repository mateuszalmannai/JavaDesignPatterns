package main.designPatternEssentials.foobarMotorCompany.threeTierApplication.main;

import main.designPatternEssentials.foobarMotorCompany.threeTierApplication.businessLayer.BusinessFacade;
import main.designPatternEssentials.foobarMotorCompany.threeTierApplication.businessLayer.EngineFactory;
import main.designPatternEssentials.foobarMotorCompany.threeTierApplication.uiLayer.EnginesFrame;

import javax.swing.*;

public class Main {
  public static void main(String[] args) {
    // create some sample data
    BusinessFacade.INSTANCE.addEngine(1300, EngineFactory.Type.STANDARD);
    BusinessFacade.INSTANCE.addEngine(1600, EngineFactory.Type.STANDARD);
    BusinessFacade.INSTANCE.addEngine(2000, EngineFactory.Type.STANDARD);
    BusinessFacade.INSTANCE.addEngine(2500, EngineFactory.Type.TURBO);

    // start the ui
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        new EnginesFrame().setVisible(true);
      }
    });
  }
}
