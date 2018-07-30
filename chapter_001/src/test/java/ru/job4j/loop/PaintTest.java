package ru.job4j.loop;

import org.junit.Test;
import java.util.StringJoiner;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 *Class to test 'Paint.java'.
 *
 *@author Marek Vorp (mailto:marek.vorp@gmail.com)
 *@version $Id$
 *@since 30.07.2018
 */
public class PaintTest {
    /**
     * Тест на проверку правой стороны пирамиды.
     */
    @Test
    public void whenPyramid4Right() {
        Paint paint = new Paint();
        String rst = paint.rightTrl(4);
        //System.out.println(rst);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("^   ")
                                .add("^^  ")
                                .add("^^^ ")
                                .add("^^^^")
                                .toString()
                )
        );
    }

    /**
     * Тест на проверку левой стороны пирамиды.
     */
    @Test
    public void whenPyramid4Left() {
        Paint paint = new Paint();
        String rst = paint.leftTrl(4);
        //System.out.println(rst);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("   ^")
                                .add("  ^^")
                                .add(" ^^^")
                                .add("^^^^")
                                .toString()
                )
        );
    }

    /**
     * Тест на проверку прорисовку всей пирамиды.
     */
    @Test
    public void whenPyramidHeightEquals4() {
        Paint paint = new Paint();
        String rst = paint.pyramid(4);
        //System.out.println(rst);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("   ^   ")
                                .add("  ^^^  ")
                                .add(" ^^^^^ ")
                                .add("^^^^^^^")
                                .toString()
                )
        );
    }
}
