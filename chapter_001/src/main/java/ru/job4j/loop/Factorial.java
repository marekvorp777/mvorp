package ru.job4j.loop;
/**
 * Программа для расчёта факториала.
 *
 * @author mvorp
 * @version 1.0
 * @since 29.07.2018
 */
public class Factorial {
    /**
     * расчёт факториала.
     *
     * @param n - натуральное число
     * @return факториал числа n
     */
    public int calc(int n) {
        /** произведение всех натуральных чисел. */
        int m = 1;

        for (int i = 1; i <= n; i++) {
            m *= i;
        }
        return m;
    }
}
