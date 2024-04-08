package projeto.ui.sampleapp.page;


import projeto.ui.sampleapp.elementos.Elementos;
import projeto.ui.sampleapp.metodos.Metodos;

public class ConfirmePage {

	Metodos metodo = new Metodos();
	Elementos el = new Elementos();
	
	
	public void buttonOk () throws InterruptedException {
		metodo.tempo();
		metodo.clicar(el.okButton);
	}
	
	
	
}
