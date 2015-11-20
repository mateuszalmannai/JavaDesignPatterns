package designPatternEssentials.foobarMotorCompany.behavioural.interpreter;

public class City {
  private String name;
  private double latitude, longitude;

  public City(String name, double latitude, double longitude) {
    this.name = name;
    this.latitude = latitude;
    this.longitude = longitude;
  }

  public String getName() {
    return name;
  }

  public double getLatitude() {
    return latitude;
  }

  public double getLongitude() {
    return longitude;
  }

  @Override
  public boolean equals(Object otherObject) {
    if (this == otherObject) return true;
    if (!(otherObject instanceof City)) return false;

    City city = (City) otherObject;

    return getName().equals(((City) otherObject).getName());

  }

  @Override
  public int hashCode() {
    return getName().hashCode();
  }

  @Override
  public String toString() {
    return getName();
  }
}
