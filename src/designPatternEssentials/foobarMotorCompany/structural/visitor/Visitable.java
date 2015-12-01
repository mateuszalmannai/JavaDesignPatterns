package designPatternEssentials.foobarMotorCompany.structural.visitor;

/**
 * Each implementing class defines a method called
 * acceptEngineVisitor() that takes a reference to
 * an EngineVisitor object as its argument.
 * All the method does is invoke the visit() method
 * of the passed-in EngineVisitor, passing back the
 * object instance.
 */
public interface Visitable {
  void acceptEngineVisitor(EngineVisitor visitor);
}
