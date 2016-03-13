package main.creational.abstractFactory.tutorialspoint;

public class AbstractFactoryPatternDemo {
  public static void main(String[] args) {

    // get shape factory
    final AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

    // get an object of type Circle and call its draw() method
    shapeFactory.getShape("CIRCLE").draw();

    // get an object of type Square and call its draw() method
    shapeFactory.getShape("SQUARE").draw();

    // get an object of type Rectangle and call its draw() method
    shapeFactory.getShape("RECTANGLE").draw();


    final AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

    // get an object of type Red and call its fill method
    colorFactory.getColor("RED").fill();
    // get an object of type Green and call its fill method
    colorFactory.getColor("GREEN").fill();
    // get an object of type Blue and call its fill method
    colorFactory.getColor("BLUE").fill();

  }
}
