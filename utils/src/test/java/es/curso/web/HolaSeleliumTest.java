package es.curso.web;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

class HolaSeleliumTest {
	
	private static WebDriver driver;
	private String url = "http://localhost:8080/web1/hola.html";
	

	@BeforeAll
	public static void  setUp() {
		 driver = new FirefoxDriver();
	}
	
	@Test
	void holaPaginaTest() {
		
		// Abrir web
		driver.get("http://localhost:8080/web1/hola.html");

		// Obtener título
		String titulo = driver.getTitle();
		
		// Verificación simple
		assertTrue(titulo.contains("hola"));

		

	}

	@Test
	void seleccionarParrafoTest() {
		// cargar el driver de firefox
		WebDriver driver = new FirefoxDriver();

		// Abrir web
		driver.get("http://localhost:8080/web1/hola.html");

		

		WebElement parrafo = driver.findElement(By.id("miparrafo"));

		// Obtener el texto
		String texto = parrafo.getText();

		System.out.println(texto);
		
		assertTrue(texto.contains("Este es un párrafo"));

	}
	
	
	
	@AfterAll
	public static  void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
