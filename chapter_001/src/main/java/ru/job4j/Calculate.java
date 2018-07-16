package ru.job4j;

/**
 *Class to write in console a simple sentence 'Hello world.'.
 *
 *@author mvorp
 *@since 09.10.2017
 *@version 1
 */
public class Calculate {
	/**
	 * Main.
	 * @param args - args.
	 */
	public static void main(String[] args) {
		System.out.println("Hello world.");
	}
	/**
	 * Method echo.
	 * @param name Your name.
	 * @return Echo plus your name.
	 */
	public String echo(String name) {
		return "Echo, echo, echo:" + name;
	}
}

