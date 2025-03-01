package com.mycompany.pruebaunitaria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias para la clase Calculadora.
 * Autor: Gerbert García
 */

public class CalculadoraTest {

    /**
     * Prueba unitaria para verificar la suma de dos números positivos.
     */
    @Test
    void testSumaPositiva() {
        Calculadora calc = new Calculadora();
        assertEquals(9, calc.sumar(5, 3), "La suma de 5 y 3 debe ser 8");
    }

    /**
     * Prueba unitaria para verificar la suma con un número negativo.
     */
    @Test
    void testSumaConNegativo() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.sumar(5, -3), "La suma de 5 y -3 debe ser 2");
    }

    /**
     * Prueba unitaria para verificar la resta con un números positivos
     */
    @Test
    void testSumaConNegativo() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.restar(10, 7), "La resta 10 y 7 debe ser 3");
    }
}
