package es.curso.negocio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NotaTest {

	@Test
	void esMayorTest() {
		
		Nota n1 = new Nota(5.0, "Matematicas");
		Nota n2 = new Nota(4.0, "Matematicas");
		
		assertTrue(n1.esMayorQue(n2));
	}

}
