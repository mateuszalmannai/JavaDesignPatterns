package designPatternEssentials.foobarMotorCompany.structural.visitor;

public abstract class AbstractEngine implements Engine {
  private int size;
  private boolean turbo;

  private Camshaft camshaft;
  private Piston piston;
  private SparkPlug[] sparkPlugs;

  public AbstractEngine(int size, boolean turbo) {
    this.size = size;
    this.turbo = turbo;

    // Create a camshaft, piston and four spark plugs...
    camshaft = new Camshaft();
    piston = new Piston();
    sparkPlugs = new SparkPlug[]{new SparkPlug(), new SparkPlug(), new SparkPlug(), new SparkPlug()};
  }

  @Override
  public int getSize() {
    return size;
  }

  @Override
  public boolean isTurbo() {
    return turbo;
  }

  @Override
  public void acceptEngineVisitor(EngineVisitor visitor) {
    // Visit each component first...
    camshaft.acceptEngineVisitor(visitor);
    piston.acceptEngineVisitor(visitor);
    for (SparkPlug sparkPlug : sparkPlugs) {
      sparkPlug.acceptEngineVisitor(visitor);
    }

    // Now visit the receiver...
    visitor.visit(this);
  }

  public String toString() {
    return getClass().getSimpleName() + " (" + size + ")";
  }
}
