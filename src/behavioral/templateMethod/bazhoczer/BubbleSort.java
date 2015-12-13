package behavioral.templateMethod.bazhoczer;

public class BubbleSort extends Algorithm {

  private int[] numbers;

  public BubbleSort(int[] numbers) {
    this.numbers = numbers;
  }

  @Override
  void initialize() {
    System.out.println(this.getClass().getSimpleName() + " initializing...");

  }

  @Override
  void internalSort() {
    int n = numbers.length;
    int temp = 0;

    while (n != 0) {
      temp = 0;
      for (int i = 1; i < n; i++) {
        if (numbers[i - 1] > numbers[i]) {
          int swap = numbers[i - 1];
          numbers[i - 1] = numbers[i];
          numbers[i] = swap;
          temp = i;
        }
      }
      n = temp;
    }
  }

  @Override
  public void printResults() {
    for (int number : numbers) {
      System.out.print(number + " ");
    }
    System.out.println();
  }
}
