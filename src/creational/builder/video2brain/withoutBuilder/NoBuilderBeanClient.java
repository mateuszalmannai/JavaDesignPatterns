package creational.builder.video2brain.withoutBuilder;

public class NoBuilderBeanClient {
  public static void main(String[] args) {
    CupboardBean cupboardBean = new CupboardBean();
    cupboardBean.setNumDoors(2);
    System.out.println(cupboardBean);

    CupboardBean bigCupboardBean = new CupboardBean();
    bigCupboardBean.setNumDoors(5);
    bigCupboardBean.setSurface(Surface.laquered);
    bigCupboardBean.setColour(Colour.Cream);
    bigCupboardBean.setMetalDrawerRails(true);
    bigCupboardBean.setNumFloors(6);
    bigCupboardBean.setClothesRail(true);
    System.out.println(bigCupboardBean);

    /*
    Problem: some combinations aren't allowed, i.e. don't make sense
     */
    CupboardBean noDoors = new CupboardBean();
    System.out.println(noDoors);

    CupboardBean withoutColourButWithColour = new CupboardBean();
    withoutColourButWithColour.setNumDoors(3);
    withoutColourButWithColour.setSurface(Surface.untreated);
    withoutColourButWithColour.setColour(Colour.Blue);       // not allowed
    System.out.println(withoutColourButWithColour);

  }
}
