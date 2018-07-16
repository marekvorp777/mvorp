package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Class to test 'Calculate.java'.
 *
 *@author Marek Vorp (mailto:marek.vorp@gmail.com)
 *@version $Id$
 *@since 09.10.2017
 */
public class CalculateTest {
	/**
	 * Test echo.
	 *
	 *@author Marek Vorp (mailto:marek.vorp@gmail.com)
	 *@version $Id$
	 *@since 09.10.2017
	 */
	@Test
	public void whenTakeNameThenTreeEchoPlusName() {
		String input = "Marek Vorp";
		String expect = "Echo, echo, echo:Marek Vorp";
		//Создание нового объекта.
		Calculate calc = new Calculate();
		//Выполнение метода echo с параметром input и запись ее в переменную result.
		String result = calc.echo(input);
		//Проверка, что метод возвращает 'result' ожидаемый результат 'expect'
		assertThat(result, is(expect));
	}
}

