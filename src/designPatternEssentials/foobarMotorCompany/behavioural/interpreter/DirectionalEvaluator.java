package designPatternEssentials.foobarMotorCompany.behavioural.interpreter;

import java.util.*;

public class DirectionalEvaluator {
  private Map<String, City> cities;

  public DirectionalEvaluator() {
    cities = new HashMap<String, City>();

    cities.put("aberdeen", new City("Aberdeen", 57.15, -2.15));
    cities.put("belfast", new City("Belfast", 54.62, -5.93));
    cities.put("birmingham", new City("Birmingham", 52.42, -1.92));
    cities.put("dublin", new City("Dublin", 53.33, -6.25));
    cities.put("edinburgh", new City("Edinburgh", 55.92, -3.02));
    cities.put("glasgow", new City("Glasgow", 55.83, -4.25));
    cities.put("london", new City("London", 51.53, -0.08));
    cities.put("liverpool", new City("Liverpool", 53.42, -3.0));
    cities.put("manchester", new City("Manchester", 53.5, -2.25));
    cities.put("southampton", new City("Southampton", 50.9, -1.38));
  }

  /**
   * The if...else... statements have been used to concentrate on the
   * Interpreter pattern. A better approach would be to use a separate
   * pattern to hande each token such as that defined in Chain of Responsibility.
   */
  public City evaluate(String route) {
    // Define the syntax tree
    Stack<Expression> expressionStack = new Stack<Expression>();

    // Parse each token in route string
    for (String token : route.split(" ")) {
      // Is token a recognised city?
      if (cities.containsKey(token)) {
        City city = cities.get(token);
        expressionStack.push(new CityExpression(city));

        // Is token to find most northerly?
      } else if (token.equals("northerly")) {
        expressionStack.push(new MostNortherlyExpression(loadExpressions(expressionStack)));

        // Is token to find most southerly?
      } else if (token.equals("southerly")) {
        expressionStack.push(new MostSoutherlyExpression(loadExpressions(expressionStack)));

        // Is token to find most westerly?
      } else if (token.equals("westerly")) {
        expressionStack.push(new MostWesterlyExpression(loadExpressions(expressionStack)));

        // Is token to find most easterly?
      } else if (token.equals("easterly")) {
        expressionStack.push(new MostEasterlyExpression(loadExpressions(expressionStack)));
      }
    }

    // Resulting value
    return expressionStack.pop().interpret();
  }

  private List<Expression> loadExpressions(Stack<Expression> expressionStack) {
    List<Expression> expressions = new ArrayList<Expression>();
    while (!expressionStack.empty()) {
      expressions.add(expressionStack.pop());
    }
    return expressions;
  }
}
