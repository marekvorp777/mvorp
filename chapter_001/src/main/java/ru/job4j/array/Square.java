package ru.job4j.array;
/**
 * Число в квадрате записанное в массив.
 *
 *@author mvorp
 *@since 30.08.2018
 *@version 1.0
 */
public class Square {
    /**
     * Заполнение массива через цикл элементами от 1 до bound возведенными в квадрат.
     *
     * @param bound - конечное число возводимое в квадрат.
     * @return - массив чисел возведеных в квадрат.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int n = 1; n <= bound; n++) {
            rst[n - 1] = n * n;
        }
        return rst;
    }
}
