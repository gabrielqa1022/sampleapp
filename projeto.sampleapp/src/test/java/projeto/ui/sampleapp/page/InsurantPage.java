package projeto.ui.sampleapp.page;

import projeto.ui.sampleapp.elementos.Elementos;
import projeto.ui.sampleapp.metodos.Metodos;

public class InsurantPage {

	Metodos metodo = new Metodos();
	Elementos el = new Elementos();
	
	public void insurantePage(String name, String lastName, String date2, String endereco, String code, String cidade, String site) {
		metodo.escrever(el.firstName1, name);
		metodo.escrever(el.lastName, lastName);
		metodo.escrever(el.date2, date2);
		metodo.clicar(el.gender);
		metodo.escrever(el.streetAdd, endereco);
		metodo.clicar(el.countryBrazil);
		metodo.escrever(el.zipe, code);
		metodo.escrever(el.city, cidade);
		metodo.clicar(el.occupation);
		metodo.clicar(el.hobbies);
		metodo.escrever(el.website, site);
	}
	
	
	public void clicoNext() {
		metodo.clicar(el.nextInsurant);

	}
	
}
