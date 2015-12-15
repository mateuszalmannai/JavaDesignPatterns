package behavioral.templateMethod.balzholczer;

public abstract class Algorithm {

  abstract void initialize();

  abstract void internalSort();

  abstract void printResults();

  public void sort() {
    initialize();
    internalSort();
    printResults();
  }
}
