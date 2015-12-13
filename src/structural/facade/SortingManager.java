package structural.facade;


/**
 * We have a unified class that stores references to a 'subsystem'
 * and we use delegation to perform the work
 */
public class SortingManager {
  private Algorithm bubbleSort;
  private Algorithm mergeSort;
  private Algorithm heapSort;

  public SortingManager() {
    bubbleSort = new BubbleSort();
    mergeSort = new MergeSort();
    heapSort = new HeapSort();
  }

  public void mergeSort(){
    mergeSort.sort();
  }

  public void bubbleSort(){
    bubbleSort.sort();
  }

  public void heapSort(){
    heapSort.sort();
  }
}
