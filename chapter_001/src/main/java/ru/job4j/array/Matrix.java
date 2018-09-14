package ru.job4j.array;

/**
 * Двухмерный массив. Таблица умножения.
 *
 *@author mvorp
 *@since 14.09.2018
 *@version 1.0
 */
public class Matrix {
    /**
     * Умножение чисел.
     *
     * @param size - размерность двумерного массива
     * @return - таблица умножения
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int n = 0; n < size; n++) {
            for (int m = 0; m < size; m++) {
                table[n][m] = (n + 1) * (m + 1);
            }
        }
        return table;
    }
}
