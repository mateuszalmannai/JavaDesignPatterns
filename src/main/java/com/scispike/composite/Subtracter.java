package com.scispike.composite;

public class Subtracter extends BinaryExpression {


  public Subtracter(Expression left, Expression right) {
    super(left, right);
  }

  @Override
  public double getValue() {
    return left.getValue() - right.getValue();
  }
}
