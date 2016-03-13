package main.behavioral.iterator.video2brain;

import java.util.Iterator;

public class WithIteratorDemo {
  public static void main(String[] args) {
    IntegerList numbers = new IntegerList(5);
    numbers.write(17, 0);
    numbers.write(52, 2);
    numbers.write(36, 4);

    System.out.println("The numbers are: ");
    Iterator<Integer> integerIterator = numbers.iterator();
    while (integerIterator.hasNext()) {
      System.out.println(integerIterator.next() + " ");
    }
    System.out.println();

    // or shorter:
    System.out.println("The numbers are still: ");
    for (Integer number : numbers) {
      System.out.println(number + " ");
    }
    System.out.println();
  }
}
