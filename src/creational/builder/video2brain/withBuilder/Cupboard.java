package creational.builder.video2brain.withBuilder;


public class Cupboard {

  private static final int MIN_DOORS = 2;
  private static final int MAX_DOORS = 7;
  private static final int MIN_FLOORS = 0;
  private static final int MAX_FLOORS = 6;

  private int numDoors;
  private Surface surface;
  private Colour colour;
  private boolean metalDrawerRails;
  private int numFloors;
  private boolean clothesRail;

  private Cupboard(int numDoors) {
    this.numDoors = numDoors;
  }

  public static class Builder{
    private Cupboard cupboard;

    public Builder(int numDoors) {
      if (numDoors < MIN_DOORS || numDoors > MAX_DOORS) {
        throw new IllegalArgumentException("Number of doors is "
          + numDoors
          + ", however must be between "
          + MIN_DOORS + " and " + MAX_DOORS);
      }
      // call private constructor
      cupboard = new Cupboard(numDoors);

      // set initial default values
      cupboard.surface = Surface.untreated;
      cupboard.colour = Colour.Lightbrown;
      cupboard.metalDrawerRails = false;
      cupboard.numFloors = 4;
      cupboard.clothesRail = false;
    }

    public Builder withSurface(Surface surface) {
      cupboard.surface = surface;
      return this;
    }

    public Builder withColour(Colour colour) {
      cupboard.colour = colour;
      return this;
    }

    public Builder withMetalDrawerRails() {
      cupboard.metalDrawerRails = true;
      return this;
    }

    public Builder withFloors(int numFloors) {
      if (numFloors < MIN_FLOORS || numFloors > MAX_FLOORS) {
        throw new IllegalArgumentException("Number of floors is "
          + numFloors
          + ", however must be between "
          + MIN_FLOORS + " and " + MAX_FLOORS);
      }
      cupboard.numFloors = numFloors;
      return this;
    }

    public Builder withClothesRail() {
      cupboard.clothesRail = true;
      return this;
    }

    /**
     * Further validation can be performed here, i.e. if there are dependencies
     * between attributes
     */
    public Cupboard build(){
      if (cupboard.surface == Surface.untreated && cupboard.colour != Colour.Lightbrown) {
        throw new IllegalStateException("Untreated surface only available in light brown");
      }
      return cupboard;
    }

  }


  @Override
  public String toString() {
    String description = "Cupboard { " + numDoors + " door(s), surface " + surface;
    if (surface != Surface.untreated) {
      description += ", colour " + colour;
    }
    if (metalDrawerRails) {
      description += ", drawers on metal rails";
    }
    description += ", " + numFloors + " floors" +
      (clothesRail ? " with" : " without") + " clothesrail }";

    return description;
  }
}
