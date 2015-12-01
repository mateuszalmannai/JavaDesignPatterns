package designPatternEssentials.foobarMotorCompany.structural.templateMethod;

public class AbstractMethodClient {
  public static void main(String[] args) {
    System.out.println("About to print a booklet for Saloon cars");
    AbstractBookletPrinter saloonBooklet = new SaloonBooklet();
    saloonBooklet.print();

    System.out.println("About to print a service history booklet");
    AbstractBookletPrinter serviceHistoryBooklet = new ServiceHistoryBooklet();
    serviceHistoryBooklet.print();
  }
}
