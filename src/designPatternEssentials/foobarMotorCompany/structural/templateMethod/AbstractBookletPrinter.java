package designPatternEssentials.foobarMotorCompany.structural.templateMethod;

/**
 * The AbstractBookletPrinter class defines several protected abstract
 * methods and one public final 'template method' that makes use of
 * the abstract methods.
 * The method is made final to prevent it from being overriden.
 * Each concrete subclass now only needs to provide the implementing code
 * for each abstract method.
 */
public abstract class AbstractBookletPrinter {
  protected abstract int getPageCount();
  protected abstract void printFrontCover();
  protected abstract void printTableOfContents();
  protected abstract void printPage(int pageNumber);
  protected abstract void printIndex();
  protected abstract void printBackCover();

  // This is the 'template method'
  public final void print(){
    printFrontCover();
    printTableOfContents();
    for (int i = 0; i < getPageCount(); i++) {
      printPage(i);
    }
    printIndex();
    printBackCover();
  }
}
