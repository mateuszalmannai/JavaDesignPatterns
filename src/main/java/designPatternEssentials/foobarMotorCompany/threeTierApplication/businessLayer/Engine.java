package main.designPatternEssentials.foobarMotorCompany.threeTierApplication.businessLayer;

import java.io.Serializable;

public interface Engine extends Serializable {
  int getSize();
  boolean isTurbo();
}
