package main.designPatternEssentials.foobarMotorCompany.behavioural.chainOfResponsibility;

/**
 *
 */
public interface EmailHandler {
  /**
   * The setNextHandler() method takes another EmailHandler object as its
   * argument which represents the handler to call if the current object is
   * unable to handle the email.
   * @param handler
   */
  void setNextHandler(EmailHandler handler);

  /**
   * The processHandler() method takes the email text as its argument and
   * determines if it iss able to handle it (i.e. if it contains one of the
   * keywords we are interested in). If the active object can handle the email
   * it does so, otherwise it just forwards to the next in the chain.
   * @param email
   */
  void processHandler(String email);
}
