package projeto.ui.sampleapp.page;


import projeto.ui.sampleapp.elementos.Elementos;
import projeto.ui.sampleapp.metodos.Metodos;

public class VehiclePage {

	Metodos metodo = new Metodos();
	Elementos el = new Elementos();

	public void vehiclePage(String kw, String date, String number, String fuel, String list, String license,
			String annual, String pay, String peso, String cylinder) {
		metodo.clicar(el.make);
		metodo.clicar(el.makeVolks);
		metodo.escrever(el.engine, kw);
		metodo.escrever(el.date, date);
		metodo.escrever(el.numerOfSeats, number);
		metodo.escrever(el.fuelType, fuel);
		metodo.escrever(el.listPrice, list);
		metodo.escrever(el.licensePlateNumber, license);
		metodo.escrever(el.annual, annual);
		metodo.escrever(el.cylinder, cylinder);
		metodo.clicar(el.model);
		metodo.clicar(el.right2);
		metodo.clicar(el.number2);
		metodo.escrever(el.pay, pay);
		metodo.escrever(el.totalKg, peso);
	}

	public void clicoNext() {
		metodo.clicar(el.next);

	}

}
