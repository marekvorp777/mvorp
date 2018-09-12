package ru.job4j.array;

/**
 * Слово начинается с ...
 *
 *@author mvorp
 *@since 12.09.2018
 *@version 1.0
 */
public class ArrayChar {
    /**
    * стринг разбитый на символы.
    */
    private char[] data;
    /**
     * конструктор, разбиение стринга на символы.
     *
     * @param line - входной стринг
     */
    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }
    /**
     * Проверяет, что слово начинается с префикса.
     *
     * @param prefix префикс.
     * @return если слово начинается с префикса
     */
    public boolean startWith(String prefix) {
        char[] value = prefix.toCharArray();
        // проверить. что массив data имеет первые элементы одинаковые с value
        for (int i = 0; i < value.length; i++) {
            if (value[i] != data [i]) {
                return false;
            }
        }
        return true;
    }
}
