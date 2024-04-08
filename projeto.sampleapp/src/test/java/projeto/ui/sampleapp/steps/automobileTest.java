package projeto.ui.sampleapp.steps;

import io.cucumber.java.After;
import io.cucumber.java.an.E;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import projeto.ui.sampleapp.navegadores.Navegadores;
import projeto.ui.sampleapp.page.ConfirmePage;
import projeto.ui.sampleapp.page.InsurantPage;
import projeto.ui.sampleapp.page.ProductPage;
import projeto.ui.sampleapp.page.SelectPricePage;
import projeto.ui.sampleapp.page.SendQuotePage;
import projeto.ui.sampleapp.page.VehiclePage;


public class automobileTest {

	VehiclePage home1 =  new VehiclePage();
	InsurantPage home2 = new InsurantPage();
	ProductPage home3 = new ProductPage();
	SelectPricePage home4 = new SelectPricePage();
	SendQuotePage home5 =  new SendQuotePage();
	ConfirmePage home6 =  new ConfirmePage();
	
	// Banco de dados 
	// dados vehicle
	String kw = "75";
	String date = "06/29/2011";
	String number = "5";
	String fuel = "Petrol";
	String list = "28000";
	String license = "2011";
	String annual = "70000";
	String pay = "200";
	String peso = "100";
	String cylinder = "100";
	// dados insurant
	String name  = "Gabriel";
	String lastName = "QA";
	String date2 = "09/19/1999";
	String endereco = "Av.Braisl";
	String code = "3333";
	String cidade = "Buzios";
	String site = "e2etreinamentos.com.br";
	// dados product
	String startDate = "09/09/2030";
	// dados send
	String email = "gabriel@lele.com";
	String phone = "21312311";
	String username = "GabrielQAs";
	String password = "Gab123";
	String comments = "Não posso desistir agora!";
	
	
	@Dado("que esteja na aba de vehicle")
	public void que_esteja_na_aba_de_vehicle() {
	    Navegadores.iniciarTeste();
	}

	@Quando("preencho todos os dados")
	public void preencho_todos_os_dados() {
	    home1.vehiclePage(kw, date, number, fuel, list, license, annual, pay, peso, cylinder);
	}
	@E("clico em next")
	public void clico_em_next() {
	    home1.clicoNext();
	}

	@Entao("preencho todos os dados insurant")
	public void preencho_todos_os_dados_insurant() {
	    home2.insurantePage(name, lastName, date2, endereco, code, cidade, site);;
	}

	@E("clico em next pela segunda vez")
	public void clico_em_next_pela_segunda_vez() {
	    home2.clicoNext();
	}

	@Entao("preencho todos os dados pruduct")
	public void preencho_todos_os_dados_pruduct() {
	    home3.productPage(startDate);
	}

	@E("clico em next pela terceira vez")
	public void clico_em_next_pela_terceira_vez() {
	    home3.nextProduct();
	}

	@Entao("escolho um opcao em select price")
	public void escolho_um_opcao_em_select_price() throws InterruptedException {
	   home4.selectPricePage();
	}

	@Entao("clico em next pela quarta vez")
	public void clico_em_next_pela_quarta_vez() {
	   home4.nextSelect();
	}

	@Entao("preencho todos os dados em send quote")
	public void preencho_todos_os_dados_em_send_quote() {
	   home5.sendQuotePage(email, phone, username, password, comments);
	}

	@Entao("clico em send")
	public void clico_em_send() {
	    home5.sendQuoteButton();
	}
	
	@Entao("clico em Ok")
	public void clico_em_ok() throws InterruptedException {
	    home6.buttonOk();
	}
	
	@After
	public void fecharNavegador() {
		Navegadores.finalizarTeste();
	}


	
}
