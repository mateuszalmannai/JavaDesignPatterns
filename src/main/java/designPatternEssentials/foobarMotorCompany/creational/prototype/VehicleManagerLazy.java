package main.designPatternEssentials.foobarMotorCompany.creational.prototype;

import main.designPatternEssentials.foobarMotorCompany.common.StandardEngine;

/**
 * Before a clone is returned, a check is made to ensure that the 'prototype'
 * object exists, and that it will be instantiated if necessary.
 * From then on it just clones the previously instantiated object.
 */
public class VehicleManagerLazy {
  private Vehicle saloon, coupe, sport, boxVan, pickup;

  public VehicleManagerLazy() {}

  public Vehicle createSaloon() {
    Vehicle vehicle;
    if (saloon == null) {
      vehicle = new Saloon(new StandardEngine(1300));
    } else {
      vehicle = (Vehicle) saloon.clone();
    }
    return vehicle;
  }

  public Vehicle createCoupe() {
    Vehicle vehicle;
    if (coupe == null) {
      vehicle = new Saloon(new StandardEngine(1300));
    } else {
      vehicle = (Vehicle) coupe.clone();
    }
    return vehicle;
  }

  public Vehicle createSport() {
    Vehicle vehicle;
    if (sport == null) {
      vehicle = new Saloon(new StandardEngine(1300));
    } else {
      vehicle = (Vehicle) sport.clone();
    }
    return vehicle;
  }

  public Vehicle createBoxVan() {
    Vehicle vehicle;
    if (boxVan == null) {
      vehicle = new Saloon(new StandardEngine(1300));
    } else {
      vehicle = (Vehicle) boxVan.clone();
    }
    return vehicle;
  }

  public Vehicle createPickup() {
    Vehicle vehicle;
    if (pickup == null) {
      vehicle = new Saloon(new StandardEngine(1300));
    } else {
      vehicle = (Vehicle) pickup.clone();
    }
    return vehicle;
  }
}
