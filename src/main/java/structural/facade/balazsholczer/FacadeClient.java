package main.structural.facade.balazsholczer;

public class FacadeClient {

  public static void main(String[] args) {
    SortingManager sortingManager = new SortingManager();
    sortingManager.bubbleSort();
    sortingManager.mergeSort();
    sortingManager.heapSort();
  }
}
