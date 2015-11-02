package designPatternEssentials.foobarMotorCompany.structural.facade;

import designPatternEssentials.foobarMotorCompany.common.StandardEngine;

public class FacadeClient {
  public static void main(String[] args) {
    final VehicleFacade vehicleFacade = new VehicleFacade();
    Vehicle car = new Coupe(new StandardEngine(1900));
    vehicleFacade.prepareForSale(car);
  }
}
