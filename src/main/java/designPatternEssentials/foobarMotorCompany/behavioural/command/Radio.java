package main.designPatternEssentials.foobarMotorCompany.behavioural.command;

/**
 * This class enables the radio to be switched on and off,
 * and provided it is switched on will enable the volume to
 * be increased or decreased one level at a time, within
 * a range of 1 to 10.
 */
public class Radio {
  public static final int MIN_VOLUME = 0;
  public static final int MAX_VOLUME = 10;
  public static final int DEFAULT_VOLUME = 5;

  private boolean on;
  private int volume;

  public Radio() {
    on = false;
    volume = DEFAULT_VOLUME;
  }

  public boolean isOn() {
    return on;
  }

  public int getVolume() {
    return volume;
  }

  public void on() {
    on = true;
    System.out.println("Radio now on, volume level " + getVolume());
  }

  public void off() {
    on = false;
    System.out.println("Radio now off");
  }

  public void volumeUp() {
    if (isOn() && getVolume() < MAX_VOLUME) {
      volume++;
      System.out.println("Volume turned up to level " + getVolume());
    }
  }

  public void volumeDown() {
    if (isOn() && getVolume() > MIN_VOLUME) {
      volume--;
      System.out.println("Volume turned down to level " + getVolume());
    }
  }
}
