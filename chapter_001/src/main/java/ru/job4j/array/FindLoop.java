package ru.job4j.array;

/**
 * Поиск элемента в цикле.
 *
 *@author mvorp
 *@since 06.09.2018
 *@version 1.0
 */
public class FindLoop {
    /**
     * Метод поиска элемента в массиве.
     *
     * @param data - заданые элементы в массивк
     * @param el - искомый элемент
     * @return - возвращение индекса найденого элемента
     */
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
