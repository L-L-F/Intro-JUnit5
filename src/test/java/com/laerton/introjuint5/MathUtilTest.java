/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laerton.introjuint5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.laerton.introjuint5.MathUtil.mdc;

/**
 *
 * @author laerton
 */
public class MathUtilTest {

    @Test
    public void testMdcAParP1() {
        final int a = 6;
        final int b = 3;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a, b);

        assertEquals(esperado, obtido);
    }

    @Test
    public void testMdcAImparP1() {
        final int a = 9;
        final int b = 3;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a, b);

        assertEquals(esperado, obtido);
    }

    @Test
    public void testMdcParesP2() {
        final int a = 16;
        final int b = 8;
        final int divisor = 4;
        final int esperado = 0;
        final int obtido = MathUtil.mdc(a, b);

        //assertEquals(esperado, obtido % divisor);
        assertTrue(obtido % divisor == 0);
    }

    @Test
    public void testMdcAPositivoP3() {
        final int a = 15;
        final int b = 0;
        final int esperado = 15;
        final int obtido = MathUtil.mdc(a, b);

        assertEquals(esperado, obtido);
    }

    @Test
    public void testMdcANegativoP3() {
        final int a = -30;
        final int b = 0;
        final int esperado = 30;
        final int obtido = MathUtil.mdc(a, b);

        assertEquals(esperado, obtido);
    }

    @Test
    public void testMdcMParP4() {
        final int a = 9;
        final int b = 3;
        final int m = 2;
        final int esperado = MathUtil.mdc(a * m, b * m);
        final int obtido = m * MathUtil.mdc(a, b);

        assertEquals(esperado, obtido);

    }

    @Test
    public void testMdcP5() {
        final int a = 7;
        final int b = 3;
        final int c = 5;
        final int esperado = mdc(a * b, c);
        final int obtido = mdc(b, c);

        System.out.println("esperado: " + esperado + " Obttido: " + obtido);
        assertEquals(esperado, obtido);

    }

    @Test
    public void testMdcP5Resultado1() {
        final int a = 7;
        final int b = 3;
        final int c = 5;
        final int esperado = 1;
        final int obtido = mdc(b, c);

        System.out.println("esperado: " + esperado + " Obttido: " + obtido);
        assertEquals(esperado, obtido);

    }

    @Test
    public void testMdcP6() {
        final int a = 8;
        final int b = 2;
        final int esperado = mdc(a, b);
        final int obtido = mdc(b, a);

        assertEquals(esperado, obtido);
    }

    @Test
    public void testMdcP7TudoNegativo() {
        final int a = -12;
        final int b = -6;
        final int esperado = 6;
        final int obtido = mdc(a, b);

        assertEquals(esperado, obtido);
    }
}
