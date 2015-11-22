package designPatternEssentials.foobarMotorCompany.behavioural.iterator;

import designPatternEssentials.foobarMotorCompany.common.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarRange implements Iterable<Vehicle>{
  private List<Vehicle> cars;

  public CarRange() {
    cars = new ArrayList<Vehicle>();

    cars.add(new Saloon(new StandardEngine(1300)));
    cars.add(new Saloon(new StandardEngine(1600)));
    cars.add(new Coupe(new StandardEngine(2000)));
    cars.add(new Sport(new TurboEngine(2500)));
  }

  public List<Vehicle> getRange() {
    return cars;
  }

  @Override
  public Iterator<Vehicle> iterator() {
    return cars.listIterator();
  }
}
