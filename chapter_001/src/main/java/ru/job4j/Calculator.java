package ru.job4j;

/**
 *Class of simple calculation operations.
 *
 *@author mvorp
 *@since 16.07.2018
 *@version 1
 */
public class Calculator {

    /**
     * result of calculation.
     */
    private double result;

    /**
     * Method: Addition of two digits.
     *
     * @param first - first digit
     * @param second - second digit
     */
    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Method: Substraction of two digits.
     *
     * @param first - first digit
     * @param second - second digit
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }

    /**
     * Method: Division of two digits.
     *
     * @param first - first digit
     * @param second - second digit
     */
    public void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * Method: Multiplication of two digits.
     *
     * @param first - first digit
     * @param second - second digit
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }

    /**
     * Method: Actual result of previous arithmetic operation.
     *
     * @return - result of calculation
     */
    public double getResult() {
        return this.result;
    }

}
