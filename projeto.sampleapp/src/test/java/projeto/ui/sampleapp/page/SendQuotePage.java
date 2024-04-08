package projeto.ui.sampleapp.page;

import projeto.ui.sampleapp.elementos.Elementos;
import projeto.ui.sampleapp.metodos.Metodos;

public class SendQuotePage {

	Metodos metodo = new Metodos();
	Elementos el = new Elementos();
	
	public void sendQuotePage(String email, String phone,String username,String password, String comments) {
		metodo.escrever(el.email, email);
		metodo.escrever(el.phone, phone);
		metodo.escrever(el.username, username);
		metodo.escrever(el.password, password);
		metodo.escrever(el.confirmPassword, password);
		metodo.escrever(el.comments, comments);
	}
	
	public void sendQuoteButton() {
		metodo.clicar(el.send);
	}
}
