package designPatternEssentials.foobarMotorCompany.otherPatterns.modelViewController;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The SatNavController class is responsible for handling the user input, which in
 * this case can be either clicking one of the direction buttons or moving the speed slider.
 * In response to the user input the Model state needs to be updated, and there is therefore
 * a reference to both SatNavView and SatNavModel in the constructor.
 * The class itself is setup to listen out for user input and reacts accordingly.
 */
public class SatNavController {
  // Need a reference to both the model and the view
  private SatNavModel model;
  private SatNavView view;

  public SatNavController(SatNavModel model, SatNavView view) {
    this.model = model;
    this.view = view;
    // The controller needs to listen to the view
    view.addNorthButtonListener(new NorthButtonListener());
    view.addSouthButtonActionListener(new SouthButtonListener());
    view.addWestButtonActionListener(new WestButtonListener());
    view.addEastButtonActionListener(new EastButtonListener());
    view.addSlideListener(new SlideListener());
  }


  // Inner classes which serve as view listeners
  private class NorthButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      view.disableNorthButton();
      view.enableSouthButton();
      view.enableEastButton();
      view.enableWestButton();
      model.setDirection(SatNavModel.Direction.NORTH);
    }
  }

  private class SouthButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      view.disableSouthButton();
      view.enableNorthButton();
      view.enableWestButton();
      view.enableEastButton();
      model.setDirection(SatNavModel.Direction.SOUTH);
    }
  }

  private class WestButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      view.disableWestButton();
      view.enableEastButton();
      view.enableNorthButton();
      view.enableSouthButton();
      model.setDirection(SatNavModel.Direction.WEST);
    }
  }

  private class EastButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      view.disableEastButton();
      view.enableNorthButton();
      view.enableSouthButton();
      view.enableWestButton();
      model.setDirection(SatNavModel.Direction.EAST);
    }
  }


  private class SlideListener implements ChangeListener {
    @Override
    public void stateChanged(ChangeEvent e) {
      JSlider slider =(JSlider)e.getSource();
      model.setSpeed(slider.getValue());
    }
  }
}
