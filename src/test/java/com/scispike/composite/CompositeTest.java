package com.scispike.composite;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertEquals;

public class CompositeTest {

  @Test
  public void testConstant() throws Exception {
    double testValue = 3.0;
    Expression e = new Constant(testValue);
    assertEquals(testValue, e.getValue(), 0.0);
    assertThat(e.getValue(), is(testValue));
  }

  @Test
  public void testAdder() throws Exception {
    double testValueA = 2.0;
    double testValueB = 4.0;
    Expression left = new Constant(testValueA);
    Expression right = new Constant(testValueB);
    Expression e = new Adder(left, right);
    assertThat(e.getValue(), is(testValueA + testValueB));
  }

  @Test
  public void testSubtractor() throws Exception {
    double testValueA = 2.0;
    double testValueB = 4.0;
    Expression left = new Constant(testValueA);
    Expression right = new Constant(testValueB);
    Expression e = new Subtracter(left, right);
    assertThat(e.getValue(), is(testValueA - testValueB));
  }

  @Test
  public void testDivider() throws Exception {
    double testValueA = 2.0;
    double testValueB = 4.0;
    Expression left = new Constant(testValueA);
    Expression right = new Constant(testValueB);
    Expression e = new Divider(left, right);
    assertThat(e.getValue(), is(testValueA / testValueB));
  }

  @Test
  public void testMultiplier() throws Exception {
    double testValueA = 2.0;
    double testValueB = 4.0;
    Expression left = new Constant(testValueA);
    Expression right = new Constant(testValueB);
    Expression e = new Muliplier(left, right);
    assertThat(e.getValue(), is(testValueA * testValueB));
  }

  @Test
  public void testComplexExpression() throws Exception {
    Expression e =
      new Divider(
        new Muliplier(
          new Adder(new Constant(3.0), new Constant(5.0)),
          new Constant(100.0)
        ),
        new Adder(new Constant(2.0), new Constant(64.0))
      );
    assertThat(e.getValue(), is(closeTo(12.121212, 0.00001)));
  }
}
