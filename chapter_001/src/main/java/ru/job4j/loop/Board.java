package ru.job4j.loop;

/**
 * Программа для построения шахматной доски в псевдографике.
 *
 *@author mvorp
 *@since 30.07.2018
 *@version 1.0
 */
public class Board {
    /**
     * Прорисовка шахматной доски без вывода на кансоль.
     *
     * @param width - ширина доски.
     * @param height - высота доски.
     * @return - шахматная доска.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                // условие проверки, что писать пробел или X
                // в задании мы определили закономерность, что X стаится, когда
                // сумма индексов высоты и ширины является четным числом
                if ((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод на новую строку.
            screen.append(ln);
        }
        return screen.toString();
    }
}
