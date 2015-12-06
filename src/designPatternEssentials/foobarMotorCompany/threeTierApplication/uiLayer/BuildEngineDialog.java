package designPatternEssentials.foobarMotorCompany.threeTierApplication.uiLayer;

import designPatternEssentials.foobarMotorCompany.threeTierApplication.businessLayer.BusinessFacade;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The OK button invokes the appropriate BusinessFacade method to add an
 * engine with the selected criteria.
 * On the main list panel the Save and Restore buttons also make appropriate
 * calls to the BusinessFacade object methods so that the currently displayed
 * data can be saved or restored.
 */
public class BuildEngineDialog extends JDialog{
  private JComboBox typeCombo, sizeCombo;

  public BuildEngineDialog(Frame owner) {
    super(owner, "Build Engine", true);
    setLayout(new BorderLayout());
    this.setLocationRelativeTo(owner);
    this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

    // Form entry panel
    JPanel formPanel = new JPanel(new GridLayout(0, 2));

    typeCombo = new JComboBox(BusinessFacade.INSTANCE.getEngineTypes());
    formPanel.add(new JLabel("Type"));
    formPanel.add(typeCombo);

    sizeCombo = new JComboBox();
    sizeCombo.addItem(1300);
    sizeCombo.addItem(1600);
    sizeCombo.addItem(2000);
    sizeCombo.addItem(2500);
    formPanel.add(new JLabel("Size"));
    formPanel.add(sizeCombo);

    add(formPanel, BorderLayout.CENTER);

    // Buttons to submit or cancel
    JPanel buttonPanel = new JPanel(new FlowLayout());

    JButton okButton = new JButton("OK");
    okButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        BusinessFacade.INSTANCE.addEngine((Integer) sizeCombo.getSelectedItem(), typeCombo.getSelectedItem());
        setVisible(false);
      }
    });
    buttonPanel.add(okButton);

    JButton cancelButton = new JButton("Cancel");
    cancelButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        setVisible(false);
      }
    });
    buttonPanel.add(cancelButton);

    add(buttonPanel, BorderLayout.SOUTH);
    pack();
  }

  public void show() {
  }
}
