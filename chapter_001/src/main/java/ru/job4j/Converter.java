package ru.job4j;

/**
 * Корвертор валюты.
 */
public class Converter {

    /**
     * количество рублей за один доллар.
     */
    private int rublesPerDollars = 60;
    /**
     * количество рублей за один евро.
     */
    private int rublesPerEuro = 70;

    /**
     * Конвертируем рубли в евро.
     *
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        return value / rublesPerEuro;
    }

    /**
     * Конвертируем рубли в доллары.
     *
     * @param value рубли.
     * @return Доллары
     */
    public int rubleToDollar(int value) {
        return value / rublesPerDollars;
    }

    /**
     * Конвертируем евро в рубли.
     *
     * @param value евро.
     * @return Рубли.
     */
    public int euroToRuble(int value) {
        return value * rublesPerEuro;
    }

    /**
     * Конвертируем доллары в рубли.
     *
     * @param value доллары.
     * @return Рубли
     */
    public int dollarToRuble(int value) {
        return value * rublesPerDollars;
    }

}