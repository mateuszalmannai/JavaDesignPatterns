package main.creational.builder.video2brain.withBuilder;


public class BuilderClient {
  public static void main(String[] args) {
    int numberOfDoors = 2;
    Cupboard cupboard = new Cupboard.Builder(numberOfDoors).build();
    System.out.println(cupboard);

    numberOfDoors = 5;
    Cupboard bigCupboard = new Cupboard.Builder(numberOfDoors)
      .withSurface(Surface.laquered)
      .withColour(Colour.Cream)
      .withMetalDrawerRails()
      .withFloors(6)
      .withClothesRail()
      .build();
    System.out.println(bigCupboard);

    Cupboard standardWithClothesRail = new Cupboard.Builder(2)
      .withClothesRail()
      .build();
    System.out.println(standardWithClothesRail);

    Cupboard standardWithMetalDrawerRails = new Cupboard.Builder(2)
      .withMetalDrawerRails()
      .build();
    System.out.println(standardWithMetalDrawerRails);


  }
}
