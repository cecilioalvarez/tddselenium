package es.curso.web;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

class TablaTest {

	private static WebDriver driver;
	private String url = "http://localhost:8080/web1/hola.html";

	
	@BeforeAll
	public static void setUp() {
		driver = new FirefoxDriver();
	}
	@Test
	void testContenidoTabla() {

		driver.get("http://localhost:8080/web1/tabla.html");
		List<WebElement> filas = driver.findElements(By.xpath("//table[@id='tablaFacturas']/tbody/tr"));

		assertEquals(4, filas.size());
		List<WebElement> columnasFila1 = filas.get(0).findElements(By.tagName("td"));
		assertEquals("F001", columnasFila1.get(0).getText());
		assertEquals("Desarrollo web", columnasFila1.get(1).getText());
		assertEquals("1200.50", columnasFila1.get(2).getText());

		// Validar segunda factura
		List<WebElement> columnasFila2 = filas.get(1).findElements(By.tagName("td"));
		assertEquals("F002", columnasFila2.get(0).getText());
		assertEquals("Mantenimiento servidor", columnasFila2.get(1).getText());
		assertEquals("350.00", columnasFila2.get(2).getText());

		// Validar tercera factura
		List<WebElement> columnasFila3 = filas.get(2).findElements(By.tagName("td"));
		assertEquals("F003", columnasFila3.get(0).getText());
		assertEquals("Licencias software", columnasFila3.get(1).getText());
		assertEquals("899.99", columnasFila3.get(2).getText());

	}

}
