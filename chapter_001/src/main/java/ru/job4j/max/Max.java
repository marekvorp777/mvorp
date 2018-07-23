package ru.job4j.max;

/**
 * Программа большего числа из двух чисел.
 *
 *@author mvorp
 *@since 23.07.2018
 *@version 1.0
 */
public class Max {

    /**
     * Метод возвращает наибольшее число.
     *
     * @param first - первое число
     * @param second - второе число
     * @return - наибольшее число
     */
    public int max(int first, int second) {
        return (first > second) ? first : second;
    }
}
