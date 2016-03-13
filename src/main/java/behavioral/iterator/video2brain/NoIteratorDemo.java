package main.behavioral.iterator.video2brain;

public class NoIteratorDemo {
  public static void main(String[] args) {
    SimpleList numbers = new SimpleList(5);
    numbers.write(17, 0);
    numbers.write(52, 2);
    numbers.write(36, 4);

    System.out.println("The numbers are: ");
    for (int i = 0; i < numbers.getSize(); i++) {
      System.out.println(numbers.read(i) + " ");
    }
    System.out.println();
  }
}
