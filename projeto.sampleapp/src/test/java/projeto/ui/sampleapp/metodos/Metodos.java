package projeto.ui.sampleapp.metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import projeto.ui.sampleapp.driver.Drivers;

public class Metodos extends Drivers {

	public void escrever(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void validarUrl(String url) {
		try {
			assertEquals(driver.getCurrentUrl(), url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void tempo() throws InterruptedException {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {

		}

	}

	public void tempo2() throws InterruptedException {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}

	}

}
