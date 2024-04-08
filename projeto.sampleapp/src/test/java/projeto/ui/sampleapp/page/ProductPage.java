package projeto.ui.sampleapp.page;

import projeto.ui.sampleapp.elementos.Elementos;
import projeto.ui.sampleapp.metodos.Metodos;

public class ProductPage {

	Metodos metodo = new Metodos();
	Elementos el = new Elementos();
	
	public void productPage(String startDate) {
		metodo.escrever(el.startDat, startDate);
		metodo.clicar(el.insuranceSum);
		metodo.clicar(el.meritRating);
		metodo.clicar(el.damageInsurance);
		metodo.clicar(el.damageInsurance);
		metodo.clicar(el.optionalProducts);
		metodo.clicar(el.courtesyCar);
		
	}
	
	public void nextProduct() {
		metodo.clicar(el.nextProduct);
	}
	
	
	
	
}
