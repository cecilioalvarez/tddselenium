package es.curso.web;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

class PruebaAutomatica {

    private static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        driver = new FirefoxDriver();
    }

    @Test
    void testContenidoTabla() {
        driver.get("http://localhost:8080/web1/tabla.html");
        
        WebElement tabla = driver.findElement(By.id("tablaFacturas"));
        List<WebElement> filas = tabla.findElements(By.xpath(".//tbody/tr"));

        assertEquals(4, filas.size(), "La tabla debería tener 4 filas de datos");

        // Validar la cuarta fila (F004) que no estaba validada completamente en TablaTest
        List<WebElement> columnasFila4 = filas.get(3).findElements(By.tagName("td"));
        assertEquals("F004", columnasFila4.get(0).getText());
        assertEquals("Consultoría técnica", columnasFila4.get(1).getText());
        assertEquals("450.75", columnasFila4.get(2).getText());
    }

    @AfterAll
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
