package main.designPatternEssentials.foobarMotorCompany.behavioural.chainOfResponsibility;

public class GeneralEnquiriesEmailHandler extends AbstractEmailHandler {
  @Override
  protected String[] matchingWords() {
    return new String[0]; // match anything
  }

  @Override
  protected void handleHere(String email) {
    System.out.println("Email handled by general enquiries.");
  }
}
