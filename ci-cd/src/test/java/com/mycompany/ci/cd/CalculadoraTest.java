/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ci.cd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Samsung Ocean
 */
public class CalculadoraTest {
    
   private final Calculadora calc = new Calculadora();

    @Test
    public void testSoma() {
        assertEquals(5, calc.soma(2, 3));
    }

    @Test
    public void testSubtracao() {
        assertEquals(1, calc.subtracao(3, 2));
    }

    @Test
    public void testDivisaoPorZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calc.divisao(1, 0);
        });
        assertEquals("Divisão por zero não é permitida.", exception.getMessage());
    }
}
