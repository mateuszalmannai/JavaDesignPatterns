package behavioral.iterator.video2brain;

public class SimpleList {
  private int[] data;

  public SimpleList(int size) {
    data = new int[size];
  }

  public void write(int value, int index) {
    data[index] = value;
  }

  public int read(int index) {
    return data[index];
  }

  public int getSize() {
    return data.length;
  }
}
