package main.creational.builder.video2brain.withoutBuilder;

public class Cupboard {

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

  public Cupboard(int numDoors) {
    this(numDoors, Surface.untreated);
  }

  public Cupboard(int numDoors, Surface surface) {
    this(numDoors, surface, Colour.Lightbrown);
  }

  public Cupboard(int numDoors, Surface surface, Colour colour) {
    this(numDoors, surface, colour, false);
  }

  public Cupboard(int numDoors, Surface surface, Colour colour, boolean metalDrawerRails) {
    this(numDoors, surface, colour, metalDrawerRails, 4);
  }

  public Cupboard(int numDoors, Surface surface, Colour colour, boolean metalDrawerRails, int numFloors) {
    this(numDoors, surface, colour, metalDrawerRails, numFloors, false);
  }

  public Cupboard(int numDoors, Surface surface, Colour colour, boolean metalDrawerRails, int numFloors, boolean clothesRail) {
    if (numDoors < MIN_DOORS || numDoors > MAX_DOORS) {
      throw new IllegalArgumentException("Number of doors is "
        + numDoors
        + ", however must be between "
        + MIN_DOORS + " and " + MAX_DOORS);
    } else {
      this.numDoors = numDoors;
    }
    this.surface = surface;
    this.colour = colour;
    this.metalDrawerRails = metalDrawerRails;
    if (numFloors < MIN_FLOORS || numFloors > MAX_FLOORS) {
      throw new IllegalArgumentException("Number of floors is "
        + numFloors
        + ", however must be between "
        + MIN_FLOORS + " and " + MAX_FLOORS);
    } else {
      this.numFloors = numFloors;
    }
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
