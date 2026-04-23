package es.curso.negocio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlumnoTest {

	@Test
	void testAddNota() {

		//arrange	
		Alumno alumno = new Alumno("Juan");
		Nota nota1 = new Nota(8.5, "Matemáticas");
		Nota nota2 = new Nota(7.0, "Lengua");
		//act
		alumno.addNota(nota1);
		alumno.addNota(nota2);
		//assert
		assertEquals(2, alumno.getNotas().size());
		assertEquals("Matemáticas", alumno.getNotas().get(0).getAsignatura());
		assertEquals(8.5, alumno.getNotas().get(0).getValor());
		assertEquals("Lengua", alumno.getNotas().get(1).getAsignatura());
		assertEquals(7.0, alumno.getNotas().get(1).getValor());
	}

}
