package designPatternEssentials.foobarMotorCompany.creational.abstractFactory;

public class VanBody implements Body {
  @Override
  public String getBodyParts() {
    return "Body shell parts for a van";
  }
}
