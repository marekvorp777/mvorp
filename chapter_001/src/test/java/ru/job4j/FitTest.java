package ru.job4j;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 *Class of tests for 'Fit.java'.
 *
 *@author mvorp
 *@since 21.07.2018
 *@version 1
 */
public class FitTest {

    /**
     * Проверка идеального веса для мужчины.
     */
    @Test
    public void manWeight() {
        Fit fit = new Fit();
        double weight = fit.manWeight(180);
        assertThat(weight, closeTo(92.0, 0.1));
    }

    /**
     * Проверка идеального веса для женщины.
     */
    @Test
    public void womanWeight() {
        Fit fit = new Fit();
        double weight = fit.womanWeight(170);
        assertThat(weight, closeTo(69.0, 0.1));
    }
}