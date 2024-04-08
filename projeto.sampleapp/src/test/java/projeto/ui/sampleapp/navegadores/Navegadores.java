package projeto.ui.sampleapp.navegadores;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import projeto.ui.sampleapp.driver.Drivers;

public class Navegadores extends Drivers{

static boolean exibirNavegador = false;
	
	public static void iniciarTeste() {
		ChromeOptions options = new ChromeOptions();
		if(exibirNavegador) {
		options.addArguments("--headless");
		}
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get("https://sampleapp.tricentis.com/101/app.php");		
	}
	
	public static void finalizarTeste() {
		driver.quit();
	}
	
}
