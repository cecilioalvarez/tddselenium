package es.curso.web;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

class FormularioTest {

	private static WebDriver driver;
	private String url = "http://localhost:8080/web1/hola.html";

	@BeforeAll
	public static void setUp() {
		driver = new FirefoxDriver();
	}

	@Test
	public void cajaTextoText() {
		driver.get("http://localhost:8080/web1/hola.html");

		WebElement cajaTexto = driver.findElement(By.id("nombre"));
		// Escribir texto
		cajaTexto.sendKeys("Juan Pérez");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Esperar 2 segundos para ver el resultado
	}

	@AfterAll
	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
