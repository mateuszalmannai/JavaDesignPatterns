package designPatternEssentials.foobarMotorCompany.structural.flyweight;

public class AbstractEngine implements Engine {

  private int size;
  private boolean turbo;

  public AbstractEngine(int size, boolean turbo) {
    this.size = size;
    this.turbo = turbo;
  }

  @Override
  public int getSize() {
    return size;
  }

  @Override
  public boolean isTurbo() {
    return turbo;
  }

 /**
  * The implementation of this new method in AbstractEngine simply
  * issues a callback to the DiagnosticTool
  */
  @Override
  public void diagnose(DiagnosticTool tool) {
    tool.runDiagnosis(this);
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + " (" + size + ")";
  }
}
