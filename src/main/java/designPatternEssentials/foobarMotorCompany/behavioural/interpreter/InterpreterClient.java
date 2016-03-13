package main.designPatternEssentials.foobarMotorCompany.behavioural.interpreter;

public class InterpreterClient {

  /**
   * Any number of cities can be enetered before each of the directional commands
   * of "northerly", "southerly", "westerly" and "easterly"
   * The above command string consisting of city names and directional keywords can
   * be thought of as forming a simple "language" that needs to be interpreted by
   * the satellite-navigation software.
   */
  public static void main(String[] args) {
    // Create the evaluator
    DirectionalEvaluator evaluator = new DirectionalEvaluator();

    // This should output "London", being the most southerly of the three entered cities.
    System.out.println(evaluator.evaluate("london edinburgh manchester southerly"));

    // This should output "Aberdeen", first determining London as the most southerly and then use that
    // result (London) and compare it to Aberdeen to tell you which of those two is the most westerly
    System.out.println(evaluator.evaluate("london endinburgh manchester southerly aberdeen westerly"));
  }
}
