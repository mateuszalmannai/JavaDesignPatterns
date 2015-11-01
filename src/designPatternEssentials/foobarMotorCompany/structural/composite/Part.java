package designPatternEssentials.foobarMotorCompany.structural.composite;

public class Part extends Item {

  public Part(String description, int cost) {
    super(description, cost);
  }

  @Override
  public void addItem(Item item) {}

  @Override
  public void removeItem(Item item) {}

  @Override
  public Item[] getItems() {
    return new Item[0];
  }
}
