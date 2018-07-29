package ru.job4j.loop;

/**
 * Программа для счетчика.
 *
 *@author mvorp
 *@since 29.07.2018
 *@version 1.0
 */
public class Counter {
    /**
     * Подсчет суммы чётных чисел в диапазоне.
     *
     * @param start - начальное число
     * @param finish - конечное число
     * @return сумма чётных чисел
     */
    public int add(int start, int finish) {

        /** сумма четных чисел. */
        int j = 0;
        if (start < finish) {
            for (; start <= finish; start++) {
                if (start % 2 == 0) {
                    j += start;
                }
            }
        } else {
            for (; start >= finish; start--) {
                if (start % 2 == 0) {
                    j += start;
                }
            }
        }

        return j;
    }
}
