package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 *Class of tests for 'Calculator.java'.
 *
 *@author mvorp
 *@since 16.07.2018
 *@version 1
 */
public class CalculatorTest {

    /**
     * Validation that 1.0 + 1.0 = 2.0 .
     */
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * Validation that 4.0 - 2.0 = 2.0 .
     */
    @Test
    public void whenSubtractFourMinusTwoThenTwo() {
        Calculator calc = new Calculator();
        calc.subtract(4D, 2D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * Validation that 4.0 / 2.0 = 2.0 .
     */
    @Test
    public void whenDivFourDivideTwoThenOne() {
        Calculator calc = new Calculator();
        calc.div(4D, 2D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * Validation that 2.0 * 2.0 = 4.0 .
     */
    @Test
    public void whenMultipleTwoMultiplyTwoThenFour() {
        Calculator calc = new Calculator();
        calc.multiple(2D, 2D);
        double result = calc.getResult();
        double expected = 4D;
        assertThat(result, is(expected));
    }
}