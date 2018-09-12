package ru.job4j.array;

/**
 * Заполнение массива true или false.
 *
 *@author mvorp
 *@since 12.09.2018
 *@version 1.0
 */
public class Check {
    /**
     * Проверка однородности заполнености массива.
     *
     * @param data - массив заполненый значениями true или false
     * @return - имеет одинаковее значение всех элементов - true, иное - false
     */
    public boolean mono(boolean[] data) {
        boolean tmp = data[0];
        for (boolean dataElement : data) {
            if (dataElement != tmp) {
                return false;
            }
        }
        return true;
    }
}
