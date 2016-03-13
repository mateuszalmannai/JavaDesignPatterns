package main.behavioral.iterator.video2brain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsClient {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    names.add("Rosa");
    names.add("Martha");
    names.add("Donna");

    for (String name : names) {
      System.out.println(name);
    }


    // collections now which iterator they implement
    for (Iterator<String>  listIterator = names.iterator();
          listIterator.hasNext(); ) {
      System.out.println(listIterator.next());
    }
  }
}
