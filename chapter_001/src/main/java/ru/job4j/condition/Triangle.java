package ru.job4j.condition;

/**
 * Class to calculate area of ​​a triangle.
 *
 * @author mvorp
 * @version 1
 * @since 25.07.2018
 */
public class Triangle {

    /**
     * точка A.
     */
    private Point a;
    /**
     * точка B.
     */
    private Point b;
    /**
     * точка C.
     */
    private Point c;

    /**
     * конструктор.
     *
     * @param a - запись значения в поле a
     * @param b - запись значения в поле b
     * @param c - запись значения в поле c
     */
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Метод вычисления полупериметра по длинам сторон.
     * <p>
     * Формула: (AB + AC + BC) / 2
     *
     * @param ab расстояние между точками A и B
     * @param ac расстояние между точками A и C
     * @param bc расстояние между точками B и C
     * @return Периментр.
     */
    public double period(double ab, double ac, double bc) {
        return (ab + ac + bc) / 2;
    }

    /**
     * Метод вычисления площади треугольника.
     *
     * @return Возвращает прощадь, если треугольник существует или -1, если треугольника нет.
     */
    public double area() {
        double rsl = -1; // мы устанавливаем значение -1, так как может быть что треугольника нет. Это значение говорит о том. что треугольника нет.
        double ab = this.a.distanceTo(this.b);
        double ac = this.a.distanceTo(this.c);
        double bc = this.b.distanceTo(this.c);
        double p = this.period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            // написать формулу для расчета площади треугольника.
            rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc)); //формула Герона с подставленными переменные ab, ac, dc, p.
        }
        return rsl;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     *
     * @param ab Длина от точки A до C.
     * @param ac Длина от точки A до C.
     * @param bc Длина от точки B до C.
     * @return false если сумма двух длин больше третьей
     */
    private boolean exist(double ab, double ac, double bc) {
         return (ab + ac > bc)
                 && (ab + bc > ac)
                 && (ac + bc > ab);
    }

//     * @return false если одна из длин является точкой?
//     */
//    private boolean exist(double ab, double ac, double bc) {
//        return ((ab * ac * bc) != 0) ? true : false;
//    }
}
