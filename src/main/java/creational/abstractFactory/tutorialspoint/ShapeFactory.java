package main.creational.abstractFactory.tutorialspoint;

public class ShapeFactory extends AbstractFactory {
  @Override
  Color getColor(String color) {
    return null;
  }

  @Override
  Shape getShape(String shapeType) {
    Shape shape = null;

    if (shapeType.equalsIgnoreCase("CIRCLE")) {
      shape = new Circle();
    } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
      shape = new Rectangle();
    } else if (shapeType.equalsIgnoreCase("SQUARE")) {
      shape = new Square();
    }

    return shape;
  }
}
