package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Class to test 'Counter.java'.
 *
 *@author Marek Vorp (mailto:marek.vorp@gmail.com)
 *@version $Id$
 *@since 29.07.2018
 */
public class CounterTest {

    /**
     * Проверка, что сумма чётных чисел с 1 по 10 будет равняться 30.
     */
        @Test
        public void whenSumEvenNumbersFromOneToTenThenThirty() {
            Counter counter = new Counter();
            int result = counter.add(1, 10);
            assertThat(result, is(30));

        }

    /**
     * Проверка, что сумма чётных чисел с 10 по 1 будет равняться 30.
     */
    @Test
    public void whenSumEvenNumbersFromTenToOneThenThirty() {
        Counter counter = new Counter();
        int result = counter.add(1, 10);
        assertThat(result, is(30));

    }

    /**
     * Проверка, что сумма чётных чисел с -1 по 1 будет равняться 0.
     */
    @Test
    public void whenSumEvenNumbersFromNegativeOneToOneThenZero() {
        Counter counter = new Counter();
        int result = counter.add(-1, 1);
        assertThat(result, is(0));

    }

}
