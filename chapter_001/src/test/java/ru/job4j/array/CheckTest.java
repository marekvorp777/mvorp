package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Class to test 'Check.java'.
 *
 *@author Marek Vorp (mailto:marek.vorp@gmail.com)
 *@version $Id$
 *@since 12.09.2018
 */
public class CheckTest {
    /**
     * Проверка, что всё элементы в массиве одинаковые.
     */
    @Test
    public void whenDataMonoByTrueThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }
    /**
     * Проверка, что не все элементы массива одинаковые.
     */
    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, false, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}
