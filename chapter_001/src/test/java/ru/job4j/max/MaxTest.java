package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Class to test 'Max.java'.
 *
 *@author Marek Vorp (mailto:marek.vorp@gmail.com)
 *@version $Id$
 *@since 23.07.2018
 */
public class MaxTest {
    /**
     * Проверка, что первое число = 1 меньше второго = 2.
     */
    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }

    /**
     * Проверка, наибольшего значения из чисел 1, 2, 3.
     */
    @Test
    public void whenOneTwoThreeThenThree() {
        Max maximum = new Max();
        int result = maximum.max(1, 2, 3);
        assertThat(result, is(3));
    }
}
