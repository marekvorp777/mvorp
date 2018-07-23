package ru.job4j.condition;

/**
 * класс описывает точку в прямоугольной системе координат..
 *
 *@author mvorp
 *@since 23.07.2018
 *@version
 */
public class Point {

    /** абсцысса точки. */
    private int x;
    /** ордината точки. */
    private int y;

    /**
     * конструктор.
     * @param x - запись значения в поле x
     * @param y - запись значения в поле y
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

  /*  public double distanceTo(Point that) {
        // Точка А - это текущая точка. К ней мы обращаемся через оператор this.
        Point a = this;
        // Точка В - это входящая точка. К ней мы можем обратиться напрямую через имя переменной that.
        // или для удобства мы создали новую переменную b и к ней присвоили переменную that.
        Point b = that;

        int x1 = a.x;
        int y1 = a.y;
        int x2 = b.x;
        int y2 = b.y;

        double result = Math.sqrt(
                Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );

        return result;
    }*/

    /**
     * Метод расчёта расстояния от дочки до точки.
     *
     * @param that - последующая точка
     * @return - расстояние между двумя точками координат
     */
    public double distanceTo(Point that) {
        return Math.sqrt(
                Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2)
        );
    }

    /**
     * метод(начальная точка) входа в программу.
     *
     * @param args - аргументы
     */
    public static void main(String[] args) {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);

        // сделаем вывод на консоль.
        System.out.println("x1 = " + a.x);
        System.out.println("y1 = " + a.y);
        System.out.println("x2 = " + b.x);
        System.out.println("y2 = " + b.y);

        // сделаем вызов метода.
        double result = a.distanceTo(b);
        System.out.println("Расстояние между точками А и В : " + result);
    }
}
