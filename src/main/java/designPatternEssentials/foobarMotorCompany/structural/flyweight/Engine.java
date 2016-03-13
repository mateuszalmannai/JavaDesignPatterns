package main.designPatternEssentials.foobarMotorCompany.structural.flyweight;

public interface Engine {
  // Methods having intrinsic (i.e. shared) state
  int getSize();

  boolean isTurbo();

  // Methods having extrinsic (i.e. unshared) state
  void diagnose(DiagnosticTool tool);
}
