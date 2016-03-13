package main.designPatternEssentials.foobarMotorCompany.structural.composite;

public abstract class Item {
  private String description;
  private int cost;

  public Item(String description, int cost) {
    this.description = description;
    this.cost = cost;
  }

  public String getDescription() {
    return description;
  }

  public int getCost() {
    return cost;
  }

  public abstract void addItem(Item item);

  public abstract void removeItem(Item item);

  public abstract Item[] getItems();

  @Override
  public String toString() {
    return description + " (cost " + getCost() + ")";
  }
}
