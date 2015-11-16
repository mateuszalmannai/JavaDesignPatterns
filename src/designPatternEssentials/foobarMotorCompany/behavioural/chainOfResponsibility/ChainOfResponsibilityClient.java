package designPatternEssentials.foobarMotorCompany.behavioural.chainOfResponsibility;

import java.util.Arrays;
import java.util.List;

public class ChainOfResponsibilityClient {

  public static void main(String[] args) {
    String email1 = "I need my car repaired";
    String email2 = "We would like to purchase your goods";
    String email3 = "This is a formal complaint about your bad performance";
    String email4 = "Buy some viagra!";
    String email5 = "Ladida, nothing to see here!";
    final List<String> emails = Arrays.asList(email1, email2, email3, email4, email5);
    for (String email : emails) {
      AbstractEmailHandler.handle(email);
    }
  }
}
