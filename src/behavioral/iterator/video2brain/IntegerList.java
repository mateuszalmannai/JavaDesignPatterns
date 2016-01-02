package behavioral.iterator.video2brain;

import java.util.Iterator;

/**
 * To fulfill the contract we need to implement iterator(),
 * which needs to return a suitable Iterator.
 * Because this specific iterator only works with this kind of list
 * and should not be instantiated without this list, the iterator
 * is implemented as a private static inner class
 */
public class IntegerList implements Iterable<Integer> {

  private int[] data;

  public IntegerList(int size) {
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

  @Override
  public Iterator<Integer> iterator() {
    return new IntegerIterator(this);
  }

  /**
   * Contract states that hasNext() and next() have to be implemented
   */
  private static class IntegerIterator implements Iterator<Integer> {

    private int position;             // remember position in list
    private IntegerList integerList;  // remember what list we're dealing with


    public IntegerIterator(IntegerList integerList) {
      this.integerList = integerList;
    }

    /**
     * Have we reached the end of the list?
     */
    @Override
    public boolean hasNext() {
      return position < integerList.getSize();
    }

    /**
     * Return the element at the current position and increment
     * the position counter
     */
    @Override
    public Integer next() {
      int number = integerList.read(position);
      position++;
      return number;
    }

    /**
     * Optional method for iterator to remove element from current position in list
     */
    @Override
    public void remove() {
      throw new UnsupportedOperationException("Not supported");
    }
  }
}
