package creational.factoryPattern.tutorialspoint;

public class FactoryPatternDemo {

  public static void main(String[] args) {
    final ShapeFactory shapeFactory = new ShapeFactory();

    // get an object of type Circle and call its draw method
    shapeFactory.getShape("CIRCLE").draw();
    // get an object of type Square and call its draw method
    shapeFactory.getShape("SQUARE").draw();
    // get an object of type Rectangle and call its draw method
    shapeFactory.getShape("RECTANGLE").draw();
  }
}
