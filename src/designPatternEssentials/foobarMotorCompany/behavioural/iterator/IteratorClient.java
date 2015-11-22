package designPatternEssentials.foobarMotorCompany.behavioural.iterator;

import designPatternEssentials.foobarMotorCompany.common.Vehicle;

import java.util.Iterator;

public class IteratorClient {
  public static void main(String[] args) {
    System.out.println("=== Our Cars ===");
    CarRange carRange = new CarRange();
    printIerator(carRange.iterator());
    System.out.println("*** using for-each loop:");
    printForEach(carRange);

    System.out.println("=== Our Vans ===");
    VanRange vanRange = new VanRange();
    printIerator(vanRange.iterator());
    System.out.println("*** using for-each loop:");
    printForEach(vanRange);
  }

  private static void printForEach(Iterable<Vehicle> carRange) {
    for (Vehicle vehicle : carRange) {
      System.out.println(vehicle);
    }
  }

  private static void printIerator(Iterator<Vehicle> iterator) {
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}
