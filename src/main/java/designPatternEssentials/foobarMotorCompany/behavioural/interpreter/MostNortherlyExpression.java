package main.designPatternEssentials.foobarMotorCompany.behavioural.interpreter;

import java.util.List;

/**
 * The list of Expression objects passed to the constructor will be of the
 * CityExpression type.
 * The interpret() method loops through each of these to determine the most
 * northerly, by comparing their latitude values.
 */
public class MostNortherlyExpression implements Expression {
  private List<Expression> expressions;

  public MostNortherlyExpression(List<Expression> expressions) {
    this.expressions = expressions;
  }

  @Override
  public City interpret() {
    City resultingCity = new City("Nowhere", -999.9, -999.9);
    for (Expression currentExpression : expressions) {
      City currentCity = currentExpression.interpret();
      if (currentCity.getLatitude() > resultingCity.getLatitude()) {
        resultingCity = currentCity;
      }
    }
    return resultingCity;
  }
}
