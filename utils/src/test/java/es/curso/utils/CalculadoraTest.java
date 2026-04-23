package es.curso.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void test() {
		// Arrange
		Calculadora calc = new Calculadora();
		// Act
		double resultado = calc.sumar(2, 3);
		// Assert
		assertEquals(5, resultado);
	}

}
