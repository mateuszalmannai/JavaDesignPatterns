package designPatternEssentials.foobarMotorCompany.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Assembly extends Item {

  private List<Item> items;

  public Assembly(String description) {
    super(description, 0);
    items = new ArrayList<Item>();
  }

  @Override
  public void addItem(Item item) {
    items.add(item);
  }

  @Override
  public void removeItem(Item item) {
    items.remove(item);
  }

  @Override
  public Item[] getItems() {
    return items.toArray(new Item[items.size()]);
  }

  // Also have to override getCost() to accumulate cost of items in list
  @Override
  public int getCost() {
    int total = 0;
    for (Item item : items) {
      total += item.getCost();
    }
    return total;
  }
}
