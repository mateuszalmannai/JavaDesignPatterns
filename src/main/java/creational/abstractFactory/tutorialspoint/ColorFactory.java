package main.creational.abstractFactory.tutorialspoint;

public class ColorFactory extends AbstractFactory {
  @Override
  Color getColor(String colorType) {

    Color color = null;

    if(colorType.equalsIgnoreCase("RED")){
      color = new Red();

    }else if(colorType.equalsIgnoreCase("GREEN")){
      color = new Green();

    }else if(colorType.equalsIgnoreCase("BLUE")){
      color = new Blue();
    }

    return color;
  }

  @Override
  Shape getShape(String shapeType) {
    return null;
  }
}
