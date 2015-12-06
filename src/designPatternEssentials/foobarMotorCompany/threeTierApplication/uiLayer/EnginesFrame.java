package designPatternEssentials.foobarMotorCompany.threeTierApplication.uiLayer;

import designPatternEssentials.foobarMotorCompany.threeTierApplication.businessLayer.BusinessFacade;

import javax.swing.*;
import java.awt.*;

public class EnginesFrame extends JFrame {
  private ManageEnginesPanel enginesPanel;

  public EnginesFrame () {
    super("Manage Engines");
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    add(buildUI(), BorderLayout.CENTER);
    pack();
    setLocationRelativeTo(null);
  }

  private Component buildUI() {
    JPanel uiPanel = new JPanel(new BorderLayout());
    enginesPanel = new ManageEnginesPanel();
    BusinessFacade.INSTANCE.addEngineListener(enginesPanel);
    uiPanel.add(enginesPanel, BorderLayout.CENTER);
    return uiPanel;
  }
}
