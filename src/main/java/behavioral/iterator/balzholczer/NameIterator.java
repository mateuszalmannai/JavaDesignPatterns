package main.behavioral.iterator.balzholczer;

public class NameIterator implements Iterator {

  private String[] names;
  private int index;

  public NameIterator(String[] names) {
    this.names = names;
  }

  @Override
  public boolean hasNext() {
    return index < names.length;
  }

  @Override
  public Object next() {
    Object result = null;
    if (hasNext()) {
      result = names[index++];
    }
    return result;
  }
}
