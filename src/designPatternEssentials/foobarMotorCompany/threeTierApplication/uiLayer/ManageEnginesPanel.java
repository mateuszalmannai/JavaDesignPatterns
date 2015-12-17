package designPatternEssentials.foobarMotorCompany.threeTierApplication.uiLayer;

import designPatternEssentials.foobarMotorCompany.threeTierApplication.businessLayer.BusinessFacade;
import designPatternEssentials.foobarMotorCompany.threeTierApplication.dbLayer.EntityEvent;
import designPatternEssentials.foobarMotorCompany.threeTierApplication.dbLayer.EntityListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * The panel implements the EntityListener interface so that it gets
 * notified whenever a new engine is added to the database, and so it
 * is making use of the Observer Pattern.
 */
public class ManageEnginesPanel extends JPanel implements EntityListener {
  private Frame owner;
  private EngineListModel enginesModel;

  ManageEnginesPanel(final Frame owner) {
    super(new BorderLayout());
    this.owner = owner;

    // Scrollable list of engines
    enginesModel = new EngineListModel();
    add(new JScrollPane(new JList(enginesModel)), BorderLayout.CENTER);

    // Buttons to add and save
    JPanel buttonPanel = new JPanel(new FlowLayout());

    JButton buildEngineButton = new JButton("Build Engine");
    buildEngineButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        new BuildEngineDialog(owner).setVisible(true);
      }
    });
    buttonPanel.add(buildEngineButton);

    JButton saveButton = new JButton("Save");
    saveButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          BusinessFacade.INSTANCE.saveEngines();
        } catch (IOException ex) {
          JOptionPane.showMessageDialog(ManageEnginesPanel.this, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
      }
    });
    buttonPanel.add(saveButton);

    JButton restoreButton = new JButton("Restore");
    restoreButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          BusinessFacade.INSTANCE.restoreEngines();
        } catch (IOException ex) {
          JOptionPane.showMessageDialog(ManageEnginesPanel.this, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
      }
    });
    buttonPanel.add(restoreButton);
    add(buttonPanel, BorderLayout.SOUTH);
  }

  public ManageEnginesPanel() { }

  @Override
  public void entityAdded(EntityEvent event) {
    enginesModel.engineAdded(event.getValue());
  }

  @Override
  public void entityRestored(EntityEvent event) {
    enginesModel.loadEngines();
  }

  // Inner class: ListModel for engines
  private class EngineListModel extends DefaultListModel {
    private java.util.List<Object> engines;

    public EngineListModel() {
      engines = new ArrayList<Object>();
      loadEngines();
    }

    private void loadEngines() {
      engines.clear();
      engines.addAll(Arrays.asList(BusinessFacade.INSTANCE.getAllEngines()));
      fireContentsChanged(this, 0, engines.size() - 1);
    }

    public Object getElementAt(int index) {
      return engines.get(index);
    }

    public int getSize() {
      return engines.size();
    }

    void engineAdded(Object engine) {
      engines.add(engine);
      fireContentsChanged(this, 0, engines.size() - 1);
    }
  }
}
