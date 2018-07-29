package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Class to test 'Factorial.java'.
 *
 *@author Marek Vorp (mailto:marek.vorp@gmail.com)
 *@version $Id$
 *@since 29.07.2018
 */
public class FactorialTest {

    /**
     * Проверка, что факториал 5-ти будет равен 120.
     */
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(5);
        assertThat(result, is(120));
    }

    /**
     * Проверка, что факториал 0-я будет равен 1.
     */
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial factorial = new Factorial();
        int result = factorial.calc(0);
        assertThat(result, is(1));
    }
}
