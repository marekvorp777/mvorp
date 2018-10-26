package ru.job4j.array;

/**
 * Квадратный массив заполнен true или false по диагоналям.
 *
 *@author mvorp
 *@since 14.09.2018
 *@version 1.0
 */
public class MatrixCheck {
    /**
     * Проверка диагоналей квадратного массива на идентичность эелементов.
     *
     * @param data - квадратный массив заполненый булевскими значениями.
     * @return истина если по диагонали одинаковые булевские значения
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        int arraySize = data.length - 1;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < i; j++) {
                if (data[arraySize][i] != data[arraySize - i + j][j] || data[i][arraySize] != data[j][arraySize - i + j]) {
                    result = false;
                    break;
                }
            }

            if (!result) {
                break;
            }
        }
        return result;
    }
}
