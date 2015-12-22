package creational.builder.video2brain.withoutBuilder;

public class CupboardBean {

  public static final int MIN_DOORS = 2;
  public static final int MAX_DOORS = 7;
  public static final int MIN_FLOORS = 0;
  public static final int MAX_FLOORS = 6;

  private int numDoors;
  private Surface surface;
  private Colour colour;
  private boolean metalDrawerRails;
  private int numFloors;
  private boolean clothesRail;

  public void setNumDoors(int numDoors) {
    if (numDoors < MIN_DOORS || numDoors > MAX_DOORS) {
      throw new IllegalArgumentException("Number of doors is "
        + numDoors
        + ", however must be between "
        + MIN_DOORS + " and " + MAX_DOORS);
    }
    this.numDoors = numDoors;
  }

  public void setSurface(Surface surface) {
    this.surface = surface;
  }

  public void setColour(Colour colour) {
    this.colour = colour;
  }

  public void setMetalDrawerRails(boolean metalDrawerRails) {
    this.metalDrawerRails = metalDrawerRails;
  }

  public void setNumFloors(int numFloors) {
    if (numFloors < MIN_FLOORS || numFloors > MAX_FLOORS) {
      throw new IllegalArgumentException("Number of floors is "
        + numFloors
        + ", however must be between "
        + MIN_FLOORS + " and " + MAX_FLOORS);
    }
    this.numFloors = numFloors;
  }

  public void setClothesRail(boolean clothesRail) {
    this.clothesRail = clothesRail;
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
