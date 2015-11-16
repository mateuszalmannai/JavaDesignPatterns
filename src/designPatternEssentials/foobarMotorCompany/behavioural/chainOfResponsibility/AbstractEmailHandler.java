package designPatternEssentials.foobarMotorCompany.behavioural.chainOfResponsibility;

/**
 * The method setNextHandler() simply stores the argument in an instance
 * variable; the decision making process is made in processHandler.
 * This has been written to utilise two protected helper methods that must
 * be implemented to concrete subclasses.
 * matchingWords() will return an array of String objects that this handler
 * is interested in
 * handleHere() is only called if this object can actually handle the email
 * and contains whatever code is required
 */
public abstract class AbstractEmailHandler implements EmailHandler {

  private EmailHandler nextHandler;

  /**
   * @param handler
   */
  @Override
  public void setNextHandler(EmailHandler handler) {
    nextHandler = handler;
  }

  @Override
  public void processHandler(String email) {
    boolean wordFound = false;

    // If no words to match against then this object can handle
    if (matchingWords().length == 0) {
      wordFound = true;
    } else {
      // Look for any of the matching words
      for (String word : matchingWords() ) {
        if (email.contains(word)) {
          wordFound = true;
          break;
        }
      }
    }

    // Can we handle email in this object?
    if (wordFound) {
      handleHere(email);
    } else {
      // Unable to handle here so forward to next in chain
      nextHandler.processHandler(email);
    }
  }

  /**
   * We need to define the sequence in which the handlers are called.
   * @param email
   */
  public static void handle(String email) {
    // Create the handler objects...
    final SpamEmailHandler spamEmailHandler = new SpamEmailHandler();
    final SalesEmailHandler salesEmailHandler = new SalesEmailHandler();
    final ServiceEmailHandler serviceEmailHandler = new ServiceEmailHandler();
    final ManagerEmailHandler managerEmailHandler = new ManagerEmailHandler();
    final GeneralEnquiriesEmailHandler generalEnquiriesEmailHandler = new GeneralEnquiriesEmailHandler();

    // Chain them together
    spamEmailHandler.setNextHandler(salesEmailHandler);
    salesEmailHandler.setNextHandler(serviceEmailHandler);
    serviceEmailHandler.setNextHandler(managerEmailHandler);
    managerEmailHandler.setNextHandler(generalEnquiriesEmailHandler);

    // Start the ball rolling
    spamEmailHandler.processHandler(email);
  }

  protected abstract String[] matchingWords();

  protected abstract void handleHere(String email);

}
