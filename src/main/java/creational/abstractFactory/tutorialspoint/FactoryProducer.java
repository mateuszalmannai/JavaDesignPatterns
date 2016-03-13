package main.creational.abstractFactory.tutorialspoint;

public class FactoryProducer {
   public static AbstractFactory getFactory(String choice) {
     AbstractFactory factory = null;
     if (choice.equalsIgnoreCase("SHAPE")) {
       factory = new ShapeFactory();
     }
     if (choice.equalsIgnoreCase("COLOR")) {
       factory = new ColorFactory();
     }

     return factory;
   }
}
