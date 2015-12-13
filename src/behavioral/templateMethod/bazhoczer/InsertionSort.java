package behavioral.templateMethod.bazhoczer;

public class InsertionSort extends Algorithm {

  private int[] numbers;

  public InsertionSort(int[] numbers) {
    this.numbers = numbers;
  }

  @Override
  void initialize() {
    System.out.println(this.getClass().getSimpleName() + " initializing...");

  }

  @Override
  void internalSort() {
    int temp;
    int j;

    for (int i = 0; i < numbers.length; i++) {
      temp = numbers[i];
      j = i;
      while (j > 0 && numbers[j - 1] > temp) {
        numbers[j] = numbers[j - 1];
        j = j - 1;
      }
      numbers[j] = temp;
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
