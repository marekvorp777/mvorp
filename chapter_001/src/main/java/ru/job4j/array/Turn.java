package ru.job4j.array;

/**
 * Переворачивание элементов в массиве.
 *
 *@author mvorp
 *@since 09.09.2018
 *@version 1.0
 */
public class Turn {
    /**
     * Метод по перевороту порядка элементов в массиве на противоположный.
     *
     * @param array - массив элементов
     * @return перевёрнутый массив.
     */
    public int[] turn(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int temp = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = temp;
        }
        return array;
    }
}
