package main.designPatternEssentials.foobarMotorCompany.structural.strategy;

import main.designPatternEssentials.foobarMotorCompany.common.StandardEngine;

public class StrategyClient {
  public static void main(String[] args) {
    AbstractCar myCar = new Sport(new StandardEngine(2000));
    myCar.setSpeed(20);
    myCar.setSpeed(40);

    System.out.println("Switching on sports mode gearbox...");
    myCar.setGearboxStrategy(new SportGearboxStrategy());
    myCar.setSpeed(20);
    myCar.setSpeed(40);
  }
}
