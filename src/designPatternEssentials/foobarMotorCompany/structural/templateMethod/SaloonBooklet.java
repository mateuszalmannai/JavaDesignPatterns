package designPatternEssentials.foobarMotorCompany.structural.templateMethod;

public class SaloonBooklet extends AbstractBookletPrinter {
  @Override
  protected int getPageCount() {
    return 100;
  }

  @Override
  protected void printFrontCover() {
    System.out.println("Printing front cover for Saloon car booklet");
  }

  @Override
  protected void printTableOfContents() {
    System.out.println("Printing table of contents for Saloon car booklet");
  }

  @Override
  protected void printPage(int pageNumber) {
    System.out.println("Printing page " + pageNumber + " for Saloon car booklet");
  }

  @Override
  protected void printIndex() {
    System.out.println("Printing index for Saloon car booklet");
  }

  @Override
  protected void printBackCover() {
    System.out.println("Printing back cover for Saloon car booklet");
  }
}
