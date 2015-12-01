package designPatternEssentials.foobarMotorCompany.structural.templateMethod;

public class ServiceHistoryBooklet extends AbstractBookletPrinter {
  @Override
  protected int getPageCount() {
    return 12;
  }

  @Override
  protected void printFrontCover() {
    System.out.println("Printing front cover for service history booklet");
  }

  @Override
  protected void printTableOfContents() {
    System.out.println("Printing table of contents for service history booklet");
  }

  @Override
  protected void printPage(int pageNumber) {
    System.out.println("Printing page " + pageNumber + " for service history booklet");
  }

  @Override
  protected void printIndex() {
    System.out.println("Printing index for service history booklet");
  }

  @Override
  protected void printBackCover() {
    System.out.println("Printing back cover for service history booklet");
  }
}
