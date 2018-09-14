package ru.job4j.array;

/**
 * Программа для сортировки массива методом перестановки(пузырьковым).
 *
 *@author mvorp
 *@since 14.09.2018
 *@version 1.0
 */
public class BubbleSort {
    /**
     * Метод сортировки пузырьком массива целых чисел.
     *
     * @param array - массив заполненый целыми сислами
     * @return - отсортированый ASC массив
     */
    public int[] sort(int[] array) {
        int tmp;
        for (int m = 0; m < array.length - 1; m++) {
            for (int n = 0; n < array.length - m - 1; n++) {
                tmp = array[n];
                if (tmp > array[n + 1]) {
                    array[n] = array[n + 1];
                    array[n + 1] = tmp;
                }
            }
        }
        return array;
    }
}
