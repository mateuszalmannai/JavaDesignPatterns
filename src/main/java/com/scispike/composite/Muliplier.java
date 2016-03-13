package com.scispike.composite;

public class Muliplier extends BinaryExpression {


  public Muliplier(Expression left, Expression right) {
    super(left, right);
  }

  @Override
  public double getValue() {
    return left.getValue() * right.getValue();
  }
}
