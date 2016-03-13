package main.designPatternEssentials.foobarMotorCompany.structural.proxy;

import main.designPatternEssentials.foobarMotorCompany.structural.flyweight.DiagnosticTool;
import main.designPatternEssentials.foobarMotorCompany.structural.flyweight.EngineDiagnosticTool;

/**
 * To force client programs to use the proxy class instead of the normal class,
 * one can either make the constructors of StandardEngine and TurboEngine package-private,
 * i.e. using no access modifier); then provided EngineProxy is in the same package it will
 * be able to instantiate them but outside objects won't.
 * It is also common to have a 'factory' class to make instantiation simpler, e.g. by
 * providing a createStandardEngine() method.
 */
public class ProxyClient {


  public static void main(String[] args) {
    createStandardEngine();
  }

  private static void createStandardEngine(){
    final EngineProxy engineProxy = new EngineProxy(1900, true);
    DiagnosticTool tool = new EngineDiagnosticTool();
    engineProxy.diagnose(tool);
  }


}
