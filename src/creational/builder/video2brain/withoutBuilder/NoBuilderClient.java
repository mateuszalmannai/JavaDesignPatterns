package creational.builder.video2brain.withoutBuilder;

public class NoBuilderClient {
  public static void main(String[] args) {
    Cupboard cupboard = new Cupboard(2);
    System.out.println(cupboard);

    Cupboard bigCupboard = new Cupboard(5, Surface.laquered, Colour.Cream, true, 6, true);
    System.out.println(bigCupboard);

  }
}
