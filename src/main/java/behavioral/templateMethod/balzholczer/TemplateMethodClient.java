package main.behavioral.templateMethod.balzholczer;

public class TemplateMethodClient {
  public static void main(String[] args) {
    int[] numbers = {100, 5, 7, -6, 0};
    Algorithm bubbleSort = new BubbleSort(numbers);
    Algorithm insertionSort = new InsertionSort(numbers);

    System.out.println("Sorting with Bubblesort:");
    bubbleSort.sort();

    System.out.println("Sorting with Insertionsort");
    insertionSort.sort();
  }
}
