package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Class to test 'FindLoop.java'.
 *
 *@author Marek Vorp (mailto:marek.vorp@gmail.com)
 *@version $Id$
 *@since 06.09.2018
 */
public class FindLoopTest {
    /**
     Проверка индекса известного элемента в массиве.
     */
    @Test
    public void whenArrayHasElement5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    /**
     Проверка если элемента нет в массиве.
     */
    @Test
    public void whenArrayHasElement999ThenNegativeNum() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 999;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}
