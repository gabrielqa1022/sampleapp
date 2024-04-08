package projeto.ui.sampleapp.page;

import projeto.ui.sampleapp.elementos.Elementos;
import projeto.ui.sampleapp.metodos.Metodos;

public class SelectPricePage {

	Metodos metodo = new Metodos();
	Elementos el = new Elementos();
	
	String msg = "Sending e-mail success!";
	
	public void selectPricePage () throws InterruptedException {
		metodo.tempo2();
		metodo.clicar(el.platinum);
		
	}
	
	public void nextSelect() {
		metodo.clicar(el.nextSelect);
	}
	
	
	
}
