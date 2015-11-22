package designPatternEssentials.foobarMotorCompany.behavioural.iterator;

import designPatternEssentials.foobarMotorCompany.common.*;

import java.util.Arrays;
import java.util.Iterator;

public class VanRange implements Iterable<Vehicle>{
  private Vehicle[] vans;

  public VanRange() {
    vans = new Vehicle[3];

    vans[0] = new BoxVan(new StandardEngine(1600));
    vans[1] = new BoxVan(new StandardEngine(2000));
    vans[2] = new Pickup(new TurboEngine(2200));
  }

  public Vehicle[] getRange() {
    return vans;
  }

  @Override
  public Iterator<Vehicle> iterator() {
    return Arrays.asList(vans).listIterator();
  }
}
