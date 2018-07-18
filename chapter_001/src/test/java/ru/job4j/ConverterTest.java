package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Class of tests for 'Converter.java'.
 *
 *@author mvorp
 *@since 18.07.2018
 *@version 1
 */
public class ConverterTest {

    /**
     * Проверка конвертации рублей в доллары.
     */
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(1));
    }

    /**
     * Проверка конвертации рублей в евро.
     */
    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(70);
        assertThat(result, is(1));
    }

    /**
     * Проверка конвертации евро в рубли.
     */
    @Test
    public void when10EuroToRublesThen700() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(10);
        assertThat(result, is(700));
    }

    /**
     * Проверка конвертации долларов в рубли.
     */
    @Test
    public void when10DollarsToRublesThen600() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(10);
        assertThat(result, is(600));
    }

}
